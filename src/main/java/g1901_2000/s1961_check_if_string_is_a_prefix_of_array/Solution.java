package g1901_2000.s1961_check_if_string_is_a_prefix_of_array;

// #Easy #Array #String #2022_05_20_Time_2_ms_(60.87%)_Space_43.5_MB_(27.83%)

public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
