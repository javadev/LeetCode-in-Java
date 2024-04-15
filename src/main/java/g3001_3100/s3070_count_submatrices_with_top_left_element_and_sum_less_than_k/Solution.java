package g3001_3100.s3070_count_submatrices_with_top_left_element_and_sum_less_than_k;

// #Medium #Array #Matrix #Prefix_Sum #2024_04_15_Time_2_ms_(100.00%)_Space_117.3_MB_(94.08%)

public class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid[0].length;
        int[] sums = new int[n];
        int ans = 0;
        for (int[] ints : grid) {
            int sum = 0;
            for (int col = 0; col < n; col++) {
                sum += ints[col];
                sums[col] += sum;
                if (sums[col] <= k) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
