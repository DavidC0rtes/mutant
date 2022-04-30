package mutation;

import gen.NTAParser;
import gen.NTAParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import util.VisitorHelper;

import java.util.List;
import java.util.Random;

public class NTAVisitor extends NTAParserBaseVisitor<String> implements VisitorHelper {

    private final boolean duplicateProcess;

    public NTAVisitor(boolean duplicateProcess) {
        this.duplicateProcess = duplicateProcess;
    }

    @Override
    public String visitModel(NTAParser.ModelContext ctx) {
        String model = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>\n";

        model = model.concat(visit(ctx.nta()));
        return model;
    }

    @Override
    public String visitNta(NTAParser.NtaContext ctx) {

        return "<nta>\n" + visit(ctx.declaration()).concat("\n") +
                visit(ctx.system()) +
                "\n</nta>\n";
    }

    @Override
    public String visitDeclaration(NTAParser.DeclarationContext ctx) {
        StringBuilder declaration = new StringBuilder(ctx.OPEN_DECLARATION().getText() + "\n");
        List<NTAParser.DeclarationsContext> decls = ctx.declarations();

        for (NTAParser.DeclarationsContext decl: decls ) {
            declaration.append(visit(decl)).append("\n");
        }

        declaration.append(ctx.CLOSE_DECLARATION().getText());
        return declaration.toString();
    }

    @Override
    public String visitVariableDecl(NTAParser.VariableDeclContext ctx) {
        StringBuilder varDecl = new StringBuilder(visit(ctx.type()) + " ");
        List<NTAParser.VariableIDContext> varIds = ctx.variableID();

        varDecl.append(extractChildren(varIds));

        return varDecl + ";";
    }

    @Override
    public String visitType(NTAParser.TypeContext ctx) {
        String type = "";

        if (ctx.prefix() != null)  {
            type += ctx.prefix().getText() + " ";
        }

        type += ctx.typeID().getText();
        return type;
    }

    @Override
    public String visitTypeDeclaration(NTAParser.TypeDeclarationContext ctx) {
        StringBuilder toReturn = new StringBuilder(
                ctx.typeDecl().TYPEDEF().getText() + " " +
                visit(ctx.typeDecl().type())
        );

        List<NTAParser.ArrayDeclContext> arrayDecls = ctx.typeDecl().arrayDecl();
        toReturn.append(ctx.typeDecl().IDENTIFIER(0).getText());

        if (arrayDecls != null && arrayDecls.size() > 0)  {

            for (int i=0; i < arrayDecls.size(); i++) {
                toReturn.append(arrayDecls.get(i).getText())
                        .append(" ")
                        .append(ctx.typeDecl().IDENTIFIER(i+1).getText()); // there are n+1 identifiers.

                if (i < arrayDecls.size() - 1)
                    toReturn.append(",");
            }
        }

        return toReturn.append(";").toString();
    }

    @Override
    public String visitFunction(NTAParser.FunctionContext ctx) {
        String func = visit(ctx.type()) + " " + ctx.IDENTIFIER() + "(";

        if (ctx.parameters() != null)  {
            func += visit(ctx.parameters());
        }
        func += ")" + visit(ctx.block());

        return func;
    }

    @Override
    public String visitParameters(NTAParser.ParametersContext ctx) {
        String params = "";
        String sep = "";
        for (ParserRuleContext paramCtx : ctx.parameter()) {
            params += sep.concat( visit(paramCtx) );
            sep = ", ";
        }

        return params;
    }

    @Override
    public String visitParameter(NTAParser.ParameterContext ctx) {
        String param = visit(ctx.type()) + " ";
        if (ctx.BITAND() != null) {
            param += ctx.BITAND().getText().concat(" ");
        }
        param += ctx.IDENTIFIER().getText().concat(" ");

        param += extractChildren(ctx.arrayDecl());
        return param;
    }

    @Override
    public String visitBlock(NTAParser.BlockContext ctx) {
        String block = "{\n";

        if (ctx.localDecl() != null) {
            for (NTAParser.LocalDeclContext lclCtx : ctx.localDecl())
                block += "\t" + visit(lclCtx) + "\n";
        }

        if (ctx.statement() != null) {
            for (NTAParser.StatementContext stmtCtx : ctx.statement())
                block += "\t" + visit(stmtCtx) + "\n";
        }

        return block.concat("}");
    }

    @Override
    public String visitSystem(NTAParser.SystemContext ctx) {
        return ctx.OPEN_SYSTEM().getText() +"\n"+
                    flatChildren(ctx.processes()) +"\n"+
                    visitSystemDecl(ctx.systemDecl()) +"\n"+
                    flatChildren(ctx.ganttDecl()) + "\n"+
                ctx.CLOSE_SYSTEM().getText();
    }


    @Override
     public String visitSystemDecl(NTAParser.SystemDeclContext ctx) {

        if (duplicateProcess) {

            List<TerminalNode> processes = ctx.IDENTIFIER();

            int randIndex = new Random().nextInt(processes.size());

            String mutation = ","+processes.get(randIndex).toString();

            StringBuilder toReturn = new StringBuilder(ctx.getText());
            toReturn.insert(6, " "); // Add space after 'system'.
            toReturn.insert(toReturn.length() - 1, mutation);

            return toReturn.toString();
        }
        return ctx.getText();
    }

    @Override
    public String visitForLoop(NTAParser.ForLoopContext ctx) {

        String forLoop = "for("
                +  visit(ctx.expr(0)) + ";"
                +  visit(ctx.expr(1)) + ";"
                +  visit(ctx.expr(2)) + ")"
                +  visit(ctx.statement());

        return forLoop;
    }

    @Override
    public String visitIteration(NTAParser.IterationContext ctx) {
        String iter = "for("
                +  ctx.IDENTIFIER() + ":"
                +  visit(ctx.type()) + ctx.CLOSE_PARENTESIS()
                +  visit(ctx.statement());
        return iter;
    }

    @Override
    public String visitWhileLoop(NTAParser.WhileLoopContext ctx) {
        String whileLoop = "while(" +  visit(ctx.expr()) + ")"
                + visit(ctx.statement());

        return whileLoop;
    }

    @Override
    public String visitDoWhileLoop(NTAParser.DoWhileLoopContext ctx) {
        String doWhile = "do " + visit(ctx.statement()) +
                " while ("
                + visit(ctx.expr())
                + ")"
                + ctx.SEMICOLON();

        return doWhile;
    }

    @Override
    public String visitIfStatement(NTAParser.IfStatementContext ctx) {
        String ifStmt = "if(" + visit(ctx.expr()) + ") "
                + visit(ctx.statement(0));

        if (ctx.statement().size() == 2) {
            ifStmt += " else " + visit(ctx.statement(1));
        }

        return ifStmt;
    }
    @Override
    public String visitReturnStmnt(NTAParser.ReturnStmntContext ctx) {
        String returnStmt = "return";

        if (ctx.expr() != null)
            returnStmt += " " + visit(ctx.expr());

        return returnStmt.concat(";");
    }

    @Override
    public String visitBracketExpr(NTAParser.BracketExprContext ctx) {
        return visit(ctx.expr(0)) + "[" + visit(ctx.expr(1)) + "]";
    }

    @Override
    public String visitQuoteExpr(NTAParser.QuoteExprContext ctx) {
        return visit(ctx.expr()) + ctx.APOSTROPHE().getText();
    }
    @Override
    public String visitParenExpr(NTAParser.ParenExprContext ctx) {
        return "(" +  visit(ctx.expr()) + ")";
    }

    @Override
    public String visitIncrement(NTAParser.IncrementContext ctx) {
        return ctx.INCREMENT().getText() + visit(ctx.expr());
    }

    @Override
    public String visitDecrement(NTAParser.DecrementContext ctx) {
        return ctx.DECREMENT().getText() + visit(ctx.expr());
    }

    @Override
    public String visitAssignExpr(NTAParser.AssignExprContext ctx) {
        return visit(ctx.expr(0)) + ctx.ASSIGN().getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitUnaryExpr(NTAParser.UnaryExprContext ctx) {
        return ctx.op.getText() + visit(ctx.expr());
    }

    @Override
    public String visitBinaryExpr(NTAParser.BinaryExprContext ctx) {
        return visit(ctx.expr(0)) + ctx.op.getText() + visit(ctx.expr(1));
    }

    @Override
    public String visitTernaryIf(NTAParser.TernaryIfContext ctx) {
        return visit(ctx.expr(0))
                + " ? " + visit(ctx.expr(1))
                + " : " + visit(ctx.expr(2));
    }

    @Override
    public String visitDotExpr(NTAParser.DotExprContext ctx) {
        return visit(ctx.expr()) + "." + ctx.IDENTIFIER().getText();
    }

    @Override
    public String visitInvokeExpr(NTAParser.InvokeExprContext ctx) {
        return visit(ctx.expr()) + "(" + visit(ctx.arguments()) + ")";
    }

    @Override
    public String visitForAll(NTAParser.ForAllContext ctx) {
        return "forall (" + ctx.IDENTIFIER() + ":" + visit(ctx.type()) + ") " + visit(ctx.expr());
    }

    @Override
    public String visitSumExpr(NTAParser.SumExprContext ctx) {
        return "sum (" + ctx.IDENTIFIER() + ":" + visit(ctx.type()) + ")" + visit(ctx.expr());
    }

    @Override
    public String visitDeadlockExpr(NTAParser.DeadlockExprContext ctx) {
        return ctx.DEADLOCK().getText();
    }

    @Override
    public String visitIDExpr(NTAParser.IDExprContext ctx) { return ctx.getText(); }

    @Override
    public String visitNatural(NTAParser.NaturalContext ctx) { return ctx.getText(); }

    @Override
    public String visitTruthExpr(NTAParser.TruthExprContext ctx) { return ctx.getText(); }

    @Override
    public String visitDot(NTAParser.DotContext ctx) { return ctx.getText(); }

    /**
     * Helper method that receives a ParserRuleContext object that may be null, and "flattens" it out by
     * returning the String representations of its children.
     * @param ctx
     * @return a String representation of ctx children, or empty string if <code>ctx == null</code>
     */
    private String flatChildren(ParserRuleContext ctx) {
        if (ctx != null) return ctx.getText();

        return "";
    }
}
