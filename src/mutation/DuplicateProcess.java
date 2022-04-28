package mutation;

import java.io.FileWriter;
import java.io.IOException;

/**
 * <code>DuplicateProcess</code> attempts to mutate the UPPAAL model by
 * duplicating one of the concurrent processes defined in the system declaration line.
 */
public class DuplicateProcess implements MutationOperator {

    private MutationEngine engine;

    public DuplicateProcess(MutationEngine engine) {
        this.engine = engine;
    }

    @Override
    public void prepare() throws IOException {
        engine.execDuplicateProcessOp();
    }

    /**
     * Writes the mutated model to a particular file.
     * @param content string to be written.
     */
    @Override
    public void writeToFile(String content) throws IOException {
        FileWriter mutWriter = new FileWriter("dupProcess.xml");
        mutWriter.write(content);
    }
}
