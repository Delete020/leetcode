/**
 * @author Delete020
 * @since 08/17/22 21:38 PM
 */
public class GameofLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int livingCell = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                livingCell = board[i][j] > 0 ? -1 : 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    if (k < 0 || k >= m) continue;
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (l < 0 || l >= n) continue;
                        if (board[k][l] > 0) {
                            livingCell++;
                        }
                    }
                }

                if (board[i][j] > 0) {
                    if (livingCell < 2 || livingCell > 3) {
                        board[i][j]++;
                    }
                } else {
                    if (livingCell == 3) {
                        board[i][j]--;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                } else if (board[i][j] == -1) {
                    board[i][j] = 1;
                }

            }
        }
    }
}