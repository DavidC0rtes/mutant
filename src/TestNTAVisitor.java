import gen.NTALexer;
import gen.NTAParser;
import gen.NTAParserBaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Random;

public class TestNTAVisitor extends NTAParserBaseVisitor {
    public String visitSystemDecl(NTAParser.SystemDeclContext ctx) {

        List<TerminalNode> processes = ctx.IDENTIFIER();

        int randIndex = new Random().nextInt(processes.size());

        StringBuilder toReturn = new StringBuilder(ctx.getText());
        String mutation = ","+processes.get(randIndex).toString();
        toReturn.insert(toReturn.length() - 1, mutation);

        return toReturn.toString();
    }

    public static void main(String[] args) throws Exception {
        String inputFile = "./examples/2doors.xml";
        if (args.length > 0) inputFile = args[0];
        CharStream input = CharStreams.fromFileName(inputFile);

        NTALexer lexer = new NTALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NTAParser parser = new NTAParser(tokens);
        ParseTree tree = parser.model();

        TestNTAVisitor visitor = new TestNTAVisitor();
        visitor.visit(tree);
    }
}
