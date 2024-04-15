package g2901_3000.s2906_construct_product_matrix;

// #Medium #Array #Matrix #Prefix_Sum #2023_12_26_Time_11_ms_(84.62%)_Space_73.2_MB_(28.57%)

public class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long prod = 1;
        int[][] ans = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans[i][j] = (int) prod;
                prod = (prod * grid[i][j]) % 12345;
            }
        }
        prod = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                ans[i][j] = (ans[i][j] * (int) prod) % 12345;
                prod *= grid[i][j];
                prod = prod % 12345;
            }
        }
        return ans;
    }
}
