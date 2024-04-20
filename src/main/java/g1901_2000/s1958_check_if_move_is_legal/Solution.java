package g1901_2000.s1958_check_if_move_is_legal;

// #Medium #Array #Matrix #Enumeration #2022_05_20_Time_0_ms_(100.00%)_Space_43.9_MB_(11.63%)

@SuppressWarnings("java:S3358")
public class Solution {

    private static final int[][] DIRS =
            new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        char opposite = (color == 'W' ? 'B' : (color == 'B' ? 'W' : ' '));
        if (opposite == ' ' || !find(board, rMove, cMove, '.')) {
            return false;
        }
        for (int[] dir : DIRS) {
            int rNext = rMove + dir[0];
            int cNext = cMove + dir[1];
            if (find(board, rNext, cNext, opposite)) {
                rNext += dir[0];
                cNext += dir[1];
                while (find(board, rNext, cNext, opposite)) {
                    rNext += dir[0];
                    cNext += dir[1];
                }
                if (find(board, rNext, cNext, color)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, final int r, final int c, final char target) {
        return (r >= 0
                && r < board.length
                && c >= 0
                && c < board[r].length
                && board[r][c] == target);
    }
}
