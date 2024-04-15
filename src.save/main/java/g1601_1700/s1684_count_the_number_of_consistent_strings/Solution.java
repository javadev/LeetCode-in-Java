package g1601_1700.s1684_count_the_number_of_consistent_strings;

// #Easy #Array #String #Hash_Table #Bit_Manipulation
// #2022_04_17_Time_6_ms_(97.04%)_Space_43_MB_(90.20%)

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int alwd = 0;
        int res = 0;
        for (int i = 0; i < allowed.length(); ++i) {
            alwd |= 1 << allowed.charAt(i);
        }
        for (String word : words) {
            int b = 0;
            for (int j = 0; j < word.length(); ++j) {
                b |= 1 << word.charAt(j);
            }
            if ((alwd | b) == alwd) {
                ++res;
            }
        }
        return res;
    }
}
