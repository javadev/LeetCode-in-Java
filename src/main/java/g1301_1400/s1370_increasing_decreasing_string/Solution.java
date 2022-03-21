package g1301_1400.s1370_increasing_decreasing_string;

// #Easy #String #Hash_Table #Counting #2022_03_21_Time_4_ms_(80.41%)_Space_43.5_MB_(64.41%)

public class Solution {
    public String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    char character = (char) (i + 'a');
                    sb.append(character);
                    count[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    char character = (char) (i + 'a');
                    sb.append(character);
                    count[i]--;
                }
            }
        }
        return sb.toString();
    }
}
