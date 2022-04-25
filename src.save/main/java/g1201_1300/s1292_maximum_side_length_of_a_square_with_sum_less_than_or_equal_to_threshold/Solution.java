package g1201_1300.s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold;

// #Medium #Array #Binary_Search #Matrix #Prefix_Sum #Binary_Search_II_Day_15
// #2022_03_10_Time_23_ms_(32.97%)_Space_78_MB_(14.49%)

public class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    prefix[i][j] = mat[i][j];
                } else if (i == 0) {
                    prefix[i][j] = mat[i][j] + prefix[0][j - 1];
                } else if (j == 0) {
                    prefix[i][j] = mat[i][j] + prefix[i - 1][0];
                } else {
                    prefix[i][j] =
                            mat[i][j] + prefix[i][j - 1] + prefix[i - 1][j] - prefix[i - 1][j - 1];
                }
            }
        }
        int low = 1;
        int high = Math.min(m, n);
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (min(mid, prefix) > threshold) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }

    int min(int length, int[][] prefix) {
        int min = 0;
        for (int i = length - 1; i < prefix.length; i++) {
            for (int j = length - 1; j < prefix[0].length; j++) {
                if (i == length - 1 && j == length - 1) {
                    min = prefix[i][j];
                } else if (i - length < 0) {
                    min = Math.min(min, prefix[i][j] - prefix[i][j - length]);
                } else if (j - length < 0) {
                    min = Math.min(min, prefix[i][j] - prefix[i - length][j]);
                } else {
                    min =
                            Math.min(
                                    min,
                                    prefix[i][j]
                                            - prefix[i][j - length]
                                            - prefix[i - length][j]
                                            + prefix[i - length][j - length]);
                }
            }
        }
        return min;
    }
}
