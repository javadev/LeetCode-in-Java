package g3801_3900.s3838_weighted_word_mapping;

// #Easy #Array #String #Simulation #Mid_Level #Biweekly_Contest_176
// #2026_07_21_Time_2_ms_(93.33%)_Space_46.37_MB_(83.88%)

public class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String s : words) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                cnt += weights[s.charAt(i) - 'a'];
            }
            ans.append((char) ('a' + (25 - (cnt % 26))));
        }
        return ans.toString();
    }
}
