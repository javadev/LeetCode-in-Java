package g1701_1800.s1768_merge_strings_alternately;

// #Easy #String #Two_Pointers #Programming_Skills_I_Day_8_String
// #2022_04_27_Time_1_ms_(86.26%)_Space_41.7_MB_(79.68%)

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1 = word1.length();
        int size2 = word2.length();
        int min = Math.min(size1, size2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (min == size1) {
            sb.append(word2, size1, size2);
        }
        if (min == size2) {
            sb.append(word1, size2, size1);
        }
        return sb.toString();
    }
}
