package g3801_3900.s3813_vowel_consonant_score;

// #Easy #String #Simulation #Mid_Level #Weekly_Contest_485
// #2026_06_09_Time_1_ms_(100.00%)_Space_43.49_MB_(68.40%)

public class Solution {
    public int vowelConsonantScore(String s) {
        int count = 0;
        String vowels = "aeiou";
        int con = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
                continue;
            }
            if (Character.isAlphabetic(ch)) {
                con++;
            }
        }
        return con == 0 ? 0 : count / con;
    }
}
