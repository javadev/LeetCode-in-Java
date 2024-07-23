package g3201_3300.s3227_vowels_game_in_a_string;

// #Medium #String #Math #Game_Theory #Brainteaser
// #2024_07_23_Time_4_ms_(96.15%)_Space_45.3_MB_(96.39%)

public class Solution {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                return true;
            }
        }
        return false;
    }
}
