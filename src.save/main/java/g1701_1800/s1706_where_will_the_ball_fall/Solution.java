package g1701_1800.s1706_where_will_the_ball_fall;

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Matrix #Simulation
// #Level_2_Day_1_Implementation/Simulation #2022_04_24_Time_2_ms_(64.55%)_Space_54.5_MB_(25.38%)

@SuppressWarnings("java:S135")
public class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] res = new int[n];
        for (int j = 0; j < n; j++) {
            int currentJ = j;
            int currentI = 0;
            while (currentJ < n && currentI < m) {
                if (grid[currentI][currentJ] == 1) {
                    currentJ++;
                    if (currentJ < n && grid[currentI][currentJ] == 1) {
                        currentI++;
                    } else {
                        break;
                    }
                } else {
                    currentJ--;
                    if (currentJ >= 0 && grid[currentI][currentJ] == -1) {
                        currentI++;
                    } else {
                        break;
                    }
                }
            }
            if (currentI == m) {
                res[j] = currentJ;
            } else {
                res[j] = -1;
            }
        }
        return res;
    }
}
