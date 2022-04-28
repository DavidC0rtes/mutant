package mutation;

import gen.NTAParser;
import gen.NTAParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Random;

public class NTAVisitor extends NTAParserBaseVisitor<String> {

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
        StringBuilder varDecl = new StringBuilder(visit(ctx.type()));
        List<NTAParser.VariableIDContext> varIds = ctx.variableID();

        for (int i = 0; i < varIds.size(); i++){
            varDecl.append(varIds.get(i).getText());
            if (i < varIds.size() - 1)
                varDecl.append(", ");
        }
        return varDecl + ";";
    }

    @Override
    public String visitType(NTAParser.TypeContext ctx) {
        String type = "";

        if (ctx.prefix() != null)  {
            type += ctx.prefix().getText() + " ";
        }

        type += ctx.typeID().getText() + " ";
        return type;
    }

    @Override
    public String visitTypeDeclaration(NTAParser.TypeDeclarationContext ctx) {
        StringBuilder toReturn = new StringBuilder(
                ctx.typeDecl().TYPEDEF().getText() + " " +
                visit(ctx.typeDecl().type()));

        List<NTAParser.ArrayDeclContext> arrayDecls = ctx.typeDecl().arrayDecl();
        toReturn.append(ctx.typeDecl().IDENTIFIER(0).getText());

        if (arrayDecls != null && arrayDecls.size() > 0)  {

            for (int i=0; i < arrayDecls.size(); i++) {
                toReturn.append(arrayDecls.get(i).getText())
                        .append(" ")
                        .append(ctx.typeDecl().IDENTIFIER(i+1));

                if (i < arrayDecls.size() - 1)
                    toReturn.append(",");
            }
        }

        return toReturn.append(";").toString();
    }

    @Override
    public String visitFunction(NTAParser.FunctionContext ctx) {
        String s = visit(ctx.type()) + ctx.IDENTIFIER();

        List params = ctx.parameters();
        if (params != null ) {
            String strParams = params.toString().replace("[","").replace("]", "");
            s = s.concat("(").concat(strParams).concat(")");
        }

        s += visit(ctx.block());
        return s;
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
