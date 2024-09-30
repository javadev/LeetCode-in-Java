package g3301_3400.s3304_find_the_k_th_character_in_string_game_i;

// #Easy #2024_09_30_Time_16_ms_(100.00%)_Space_44.5_MB_(100.00%)

public class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        sb.append(c);
        String s = sb.toString();
        while (s.length() <= k) {
            s = sb.toString();
            char[] cq = s.toCharArray();
            for (char c1 : cq) {
                int ascii = (int) c1;
                c1 = (char) (ascii + 1);
                sb.append(c1);
            }
        }
        for (int i = 0; i < sb.toString().length(); i++) {
            if (i == k) {
                return sb.toString().charAt(i - 1);
            }
        }
        return '\0';
    }
}
