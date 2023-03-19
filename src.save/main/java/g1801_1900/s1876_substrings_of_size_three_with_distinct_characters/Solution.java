package g1801_1900.s1876_substrings_of_size_three_with_distinct_characters;

// #Easy #String #Hash_Table #Counting #Sliding_Window
// #2022_05_11_Time_2_ms_(60.62%)_Space_42.5_MB_(33.66%)

public class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String candidate = s.substring(i, i + 3);
            if (candidate.charAt(0) != candidate.charAt(1)
                    && candidate.charAt(0) != candidate.charAt(2)
                    && candidate.charAt(1) != candidate.charAt(2)) {
                count++;
            }
        }
        return count;
    }
}
