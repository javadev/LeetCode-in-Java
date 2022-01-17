package g0601_0700.s0657_robot_return_to_origin;

// #Easy #String #Simulation

public class Solution {
    public boolean judgeCircle(String moves) {
        int hori = 0;
        int verti = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                verti++;
            } else if (c == 'D') {
                verti--;
            } else if (c == 'L') {
                hori--;
            } else if (c == 'R') {
                hori++;
            }
        }
        return verti == 0 && hori == 0;
    }
}
