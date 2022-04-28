package mutation;

import java.io.IOException;

public interface MutationOperator {

    public void prepare() throws IOException;

    public void writeToFile(String content) throws IOException;
}