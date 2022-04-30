package util;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public interface VisitorHelper {

    /**
     * This method receives an array of ParserRuleContext and returns
     * a String with the String representation of every item in the array,
     * separated by commas.
     * @param lst list of <code>ParserRuleContext</code>.
     * @return String.
     */
    default String extractChildren(List<? extends ParserRuleContext> lst) {
        StringBuilder str = new StringBuilder();
        String sep = "";
        for (ParserRuleContext ctx : lst ) {
            str.append(sep).append(ctx.getText());
            sep = ", ";
        }

        return str.toString();
    }
}
