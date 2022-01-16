package g0601_0700.s0657_robot_return_to_origin;

// #Easy #String #Simulation

public class Solution {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.isEmpty()) {
            return true;
        }
        int[] map = new int[26];
        for (char c : moves.toCharArray()) {
            map[c - 'A']++;
        }
        return map['U' - 'A'] == map['D' - 'A'] && map['L' - 'A'] == map['R' - 'A'];
    }
}
