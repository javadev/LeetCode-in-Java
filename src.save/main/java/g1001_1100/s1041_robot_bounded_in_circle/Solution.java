package g1001_1100.s1041_robot_bounded_in_circle;

// #Medium #String #Math #Simulation #2022_02_27_Time_0_ms_(100.00%)_Space_39.9_MB_(14.49%)

public class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int i = 0;
        int x = 0;
        int y = 0;

        for (int s = 0; s < instructions.length(); s++) {
            if (instructions.charAt(s) == 'L') {
                i = (i + 1) % 4;
            } else if (instructions.charAt(s) == 'R') {
                i = (i + 3) % 4;
            } else {
                x = x + dir[i][0];
                y = y + dir[i][1];
            }
        }
        return x == 0 && y == 0 || i != 0;
    }
}
