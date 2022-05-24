package g2001_2100.s2027_minimum_moves_to_convert_string;

// #Easy #String #Greedy #2022_05_25_Time_4_ms_(5.74%)_Space_42.1_MB_(37.50%)

public class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'O') {
                i++;
                continue;
            }
            String candidate = i + 3 <= s.length() ? s.substring(i, i + 3) : s.substring(i);
            if (candidate.contains("X")) {
                moves++;
                i += 3;
            } else {
                i++;
            }
        }
        return moves;
    }

}
