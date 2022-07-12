/**
 * @author Delete020
 * @since 07/12/22 21:20 PM
 */
public class CellswithOddValuesinaMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] count = new boolean[50];
        int rowCount = 0;
        for (int i = 0; i < indices.length; i++) {
            count[indices[i][0]] = !count[indices[i][0]];
            rowCount = count[indices[i][0]] ? rowCount + 1 : rowCount - 1;
        }

        count = new boolean[50];
        int colCount = 0;
        for (int i = 0; i < indices.length; i++) {
            count[indices[i][1]] = !count[indices[i][1]];
            colCount = count[indices[i][1]] ? colCount + 1 : colCount - 1;
        }

        return rowCount * (n - colCount) + colCount * (m - rowCount);
    }
}