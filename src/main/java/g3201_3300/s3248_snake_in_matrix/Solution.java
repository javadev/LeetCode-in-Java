package g3201_3300.s3248_snake_in_matrix;

// #Easy #Array #String #Simulation #2024_08_13_Time_2_ms_(98.05%)_Space_44.4_MB_(66.96%)

import java.util.List;

public class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int y = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    if (x > 0) {
                        x--;
                    }
                    break;
                case "DOWN":
                    if (x < n - 1) {
                        x++;
                    }
                    break;
                case "LEFT":
                    if (y > 0) {
                        y--;
                    }
                    break;
                case "RIGHT":
                    if (y < n - 1) {
                        y++;
                    }
                default:
                    break;
            }
        }
        return (x * n) + y;
    }
}
