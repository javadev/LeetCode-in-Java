package g2801_2900.s2825_make_string_a_subsequence_using_cyclic_increments;

// #Medium #String #Two_Pointers #2023_12_11_Time_5_ms_(99.69%)_Space_44.9_MB_(14.37%)

public class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str1ptr = 0;
        for (int i = 0; i < str2.length(); i++) {
            char c2 = str2.charAt(i);
            boolean found = false;
            while (str1ptr < str1.length()) {
                char c1 = str1.charAt(str1ptr++);
                if (c1 == c2 || (c1 - 'a' + 1) % 26 == c2 - 'a') {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
