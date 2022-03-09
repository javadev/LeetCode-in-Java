package g1201_1300.s1209_remove_all_adjacent_duplicates_in_string_ii;

// #Medium #String #Stack #2022_03_09_Time_15_ms_(88.34%)_Space_46.8_MB_(71.87%)

public class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int dupCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() != 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                dupCount++;
            } else {
                dupCount = 1;
            }
            sb.append(s.charAt(i));
            if (dupCount == k) {
                sb.setLength(sb.length() - k);
                if (i + 1 < s.length()) {
                    dupCount = 0;
                    for (int j = sb.length() - 1; j >= 0; j--) {
                        if (sb.charAt(j) == s.charAt(i + 1)) {
                            dupCount++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}
