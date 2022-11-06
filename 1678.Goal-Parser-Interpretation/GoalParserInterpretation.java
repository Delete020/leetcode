/**
 * @author Delete020
 * @since 11/06/22 23:16 PM
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}