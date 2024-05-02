package g3101_3200.s3127_make_a_square_with_the_same_color;

// #Easy #Array #Matrix #Enumeration #2024_05_02_Time_0_ms_(100.00%)_Space_41.7_MB_(64.59%)

public class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                int countBlack = 0;
                int countWhite = 0;
                for (int k = i; k <= i + 1; k++) {
                    for (int l = j; l <= j + 1; l++) {
                        if (grid[k][l] == 'W') {
                            countWhite++;
                        } else {
                            countBlack++;
                        }
                    }
                }
                if (countBlack >= 3 || countWhite >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
