package g2601_2700.s2639_find_the_width_of_columns_of_a_grid;

// #Easy #Array #Matrix #2023_09_05_Time_2_ms_(99.70%)_Space_44.6_MB_(34.43%)

public class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            int max = 1;
            for (int[] ints : grid) {
                int num = ints[j];
                boolean neg = false;
                if (num < 0) {
                    neg = true;
                    num *= -1;
                }
                int size = 0;
                while (num > 0) {
                    num /= 10;
                    size++;
                }
                if (neg) {
                    size += 1;
                }
                max = Math.max(max, size);
            }
            ans[j] = max;
        }
        return ans;
    }
}
