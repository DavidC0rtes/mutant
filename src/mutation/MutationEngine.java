package mutation;

import gen.NTALexer;
import gen.NTAParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class <code>MutationEngine</code> defines the "engine" responsible
 * for scheduling mutations via the selected mutation operators using threads.
 */
public class MutationEngine {

    private ParseTree tree;
    private NTAParser parser;
    private File outputFile;

    /**
     * Constructor for MutationEngine
     * @param modelFilePath filepath to the model.
     * @param outputFile filepath to the generated mutant. It is not necessary to manually create
     *                   the file beforehand.
     * @throws IOException
     */
    public MutationEngine(String modelFilePath, File outputFile) throws IOException {
        this.outputFile = outputFile;
        CharStream input = CharStreams.fromFileName(modelFilePath);

        NTALexer lexer = new NTALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        this.parser = new NTAParser(tokens);
        this.tree = parser.model();
    }

    public void execDuplicateProcessOp() throws IOException {
        NTAVisitor eval = new NTAVisitor(true);
        FileWriter writer = new FileWriter(outputFile);
        writer.write(eval.visit(tree));
        writer.close();
    }
}
