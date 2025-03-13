package g0901_1000.s0999_available_captures_for_rook;

// #Easy #Array #Matrix #Simulation #2025_03_13_Time_0_ms_(100.00%)_Space_40.75_MB_(94.97%)

@SuppressWarnings("java:S135")
public class Solution {
    public int numRookCaptures(char[][] board) {
        // Find the position of the rook
        int rookRow = -1;
        int rookCol = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
            if (rookRow != -1) {
                break;
            }
        }
        // Define the four directions: up, right, down, left
        int[][] directions = {
            // up
            {-1, 0},
            // right
            {0, 1},
            // down
            {1, 0},
            // left
            {0, -1}
        };
        int captureCount = 0;
        // Check each direction
        for (int[] dir : directions) {
            int row = rookRow;
            int col = rookCol;
            while (true) {
                // Move one step in the current direction
                row += dir[0];
                col += dir[1];
                // Check if out of bounds
                if (row < 0 || row >= 8 || col < 0 || col >= 8) {
                    break;
                }
                // If we hit a bishop, we're blocked
                if (board[row][col] == 'B') {
                    break;
                }
                // If we hit a pawn, we can capture it and then we're blocked
                if (board[row][col] == 'p') {
                    captureCount++;
                    break;
                }
                // Otherwise (empty square), continue in the same direction
            }
        }
        return captureCount;
    }
}
