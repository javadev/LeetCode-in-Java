package g1201_1300.s1267_count_servers_that_communicate;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Counting #Union_Find
// #2022_03_14_Time_5_ms_(41.00%)_Space_64.4_MB_(52.62%)

public class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCount = new int[m];
        int[] columnCount = new int[n];
        int total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    columnCount[j]++;
                    total++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && columnCount[j] == 1) {
                    total--;
                }
            }
        }
        return total;
    }
}
