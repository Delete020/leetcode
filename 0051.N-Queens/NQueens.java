import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Delete020
 * @since 6/24/22 11:09 PM
 */
public class NQueens {
    List<List<String>> res;
    int n;
    char[][] board;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();

        board = new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }

        backtrace(0);
        return res;
    }

    private void backtrace(int row) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (char[] rowArray : board) {
                list.add(new String(rowArray));
            }
            res.add(list);
        }

        for (int i = 0; i < n; i++) {
            if (!isValid(row, i)) {
                continue;
            }

            board[row][i] = 'Q';
            backtrace(row + 1);
            board[row][i] = '.';
        }
    }

    private boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
