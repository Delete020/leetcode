/**
 * @author Delete020
 * @since 12/08/22 20:57 PM
 */
public class DetermineColorofaChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '1';
        return col % 2 != row % 2;
    }
}