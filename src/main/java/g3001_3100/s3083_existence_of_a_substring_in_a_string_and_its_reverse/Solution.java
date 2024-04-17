package g3001_3100.s3083_existence_of_a_substring_in_a_string_and_its_reverse;

// #Easy #String #Hash_Table #2024_04_17_Time_1_ms_(99.84%)_Space_41.7_MB_(96.32%)

public class Solution {
    public boolean isSubstringPresent(String s) {
        if (s.length() == 1) {
            return false;
        }
        StringBuilder revSb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            revSb.append(s.charAt(i));
        }
        String rev = revSb.toString();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = s.substring(i, i + 2);
            if (rev.contains(sub)) {
                return true;
            }
        }
        return false;
    }
}
