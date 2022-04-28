import mutation.DuplicateProcess;
import mutation.MutationEngine;
import mutation.MutationOperator;

import java.io.File;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {

        try {
            File outputFile = new File("./examples/mutant.xml");
            MutationEngine engine = new MutationEngine("./examples/scheduling3.xml", outputFile);

            MutationOperator dupMutant = new DuplicateProcess(engine);
            dupMutant.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
