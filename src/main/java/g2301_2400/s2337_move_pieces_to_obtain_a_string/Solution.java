package g2301_2400.s2337_move_pieces_to_obtain_a_string;

// #Medium #String #Two_Pointers #2022_07_13_Time_23_ms_(82.39%)_Space_54.8_MB_(61.95%)

public class Solution {
    public boolean canChange(String start, String target) {
        int i = -1;
        int j = -1;
        while (true) {
            while (true) {
                if (++i >= start.length() || start.charAt(i) != '_') {
                    break;
                }
            }
            while (true) {
                if (++j >= target.length() || target.charAt(j) != '_') {
                    break;
                }
            }
            if (i == start.length() && j == target.length()) {
                return true;
            }
            if (i == start.length() || j == target.length()) {
                return false;
            }
            if ((start.charAt(i) != target.charAt(j)) || (start.charAt(i) == 'L' ? j > i : i > j)) {
                return false;
            }
        }
    }
}
