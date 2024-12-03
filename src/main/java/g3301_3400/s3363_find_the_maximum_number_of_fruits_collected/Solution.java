package g3301_3400.s3363_find_the_maximum_number_of_fruits_collected;

// #Hard #Array #Dynamic_Programming #Matrix #2024_12_03_Time_12_ms_(91.34%)_Space_142.1_MB_(88.96%)

public class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        // Set inaccessible cells to 0
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i < j && j < n - 1 - i) {
                    fruits[i][j] = 0;
                }
                if (j < i && i < n - 1 - j) {
                    fruits[i][j] = 0;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += fruits[i][i];
        }
        for (int i = 1; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                fruits[i][j] +=
                        Math.max(
                                fruits[i - 1][j - 1],
                                Math.max(fruits[i - 1][j], (j + 1 < n) ? fruits[i - 1][j + 1] : 0));
            }
        }
        for (int j = 1; j < n; ++j) {
            for (int i = j + 1; i < n; ++i) {
                fruits[i][j] +=
                        Math.max(
                                fruits[i - 1][j - 1],
                                Math.max(fruits[i][j - 1], (i + 1 < n) ? fruits[i + 1][j - 1] : 0));
            }
        }
        return res + fruits[n - 1][n - 2] + fruits[n - 2][n - 1];
    }
}
