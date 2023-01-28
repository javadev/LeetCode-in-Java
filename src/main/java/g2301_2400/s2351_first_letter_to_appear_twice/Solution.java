package g2301_2400.s2351_first_letter_to_appear_twice;

// #Easy #String #Hash_Table #Counting #2022_08_14_Time_0_ms_(100.00%)_Space_42.3_MB_(29.00%)

public class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        int[] hm = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hm[c - 'a']++;
            if (hm[c - 'a'] > 1) {
                return c;
            }
        }
        return '0';
    }
}
