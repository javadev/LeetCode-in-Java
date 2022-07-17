package g1201_1300.s1289_minimum_falling_path_sum_ii;

// #Hard #Array #Dynamic_Programming #Matrix #2022_03_10_Time_2_ms_(99.45%)_Space_49.8_MB_(80.07%)

public class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid[0].length;
        int[] prev = new int[n];
        int[] curr = new int[n];
        int prevMinOne = 0;
        int prevMinTwo = 0;
        for (int[] ints : grid) {
            int currMinOne = Integer.MAX_VALUE;
            int currMinTwo = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int prevMin = prev[j] == prevMinOne ? prevMinTwo : prevMinOne;
                curr[j] = ints[j] + prevMin;
                if (curr[j] < currMinOne) {
                    currMinTwo = currMinOne;
                    currMinOne = curr[j];
                } else if (curr[j] < currMinTwo) {
                    currMinTwo = curr[j];
                }
            }
            prevMinOne = currMinOne;
            prevMinTwo = currMinTwo;
            // reuse curr array, avoid new int[] in every row
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prevMinOne;
    }
}
