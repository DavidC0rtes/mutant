import gen.NTALexer;
import gen.NTAParser;
import gen.NTAParserBaseListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.InputStream;
import java.util.List;

public class TestNTAListener extends NTAParserBaseListener {



    public void exitSystemDecl(NTAParser.SystemDeclContext ctx) {
        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        //List<TerminalNode> processes = identifiers.subList(0, identifiers.size());

        /**
         * Ejemplo: System Foo; -> System Foo Foo;
         * usar strings (string builder)
         */
        System.out.println(ctx.getToken(NTALexer.COMMA,0));
        ctx.children.add(
                ctx.children.size() - 1, // En la penúltima posición de los hijos...
                ctx.getToken(NTALexer.COMMA,0) // ...duplicar el último proceso.
        );
    }

    public static void main(String[] args) throws Exception {
        String inputFile = "./examples/basic.xml";
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        CharStream input = CharStreams.fromFileName(inputFile);

        NTALexer lexer = new NTALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NTAParser parser = new NTAParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.model();

        ParseTreeWalker walker = new ParseTreeWalker();
        TestNTAListener loader = new TestNTAListener();
        walker.walk(loader, tree);
        System.out.println(tree.getText());
    }
}
