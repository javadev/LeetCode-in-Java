package g2801_2900.s2840_check_if_strings_can_be_made_equal_with_operations_ii;

// #Medium #String #Hash_Table #Sorting #2023_12_12_Time_4_ms_(100.00%)_Space_44.6_MB_(50.60%)

public class Solution {
    public boolean checkStrings(String s1, String s2) {
        return check(0, s1, s2) && check(1, s1, s2);
    }

    boolean check(int start, String s1, String s2) {
        int step = 2;
        int[] buf = new int[26];
        for (int i = start; i < s1.length(); i += step) {
            buf[s1.charAt(i) - 'a']++;
            buf[s2.charAt(i) - 'a']--;
        }
        for (int j : buf) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
