package g3201_3300.s3297_count_substrings_that_can_be_rearranged_to_contain_a_string_i;

// #Medium #String #Hash_Table #Sliding_Window #2024_09_24_Time_5_ms_(99.40%)_Space_44.9_MB_(51.04%)

public class Solution {
    public long validSubstringCount(String word1, String word2) {
        long res = 0;
        int keys = 0;
        int len = word1.length();
        int[] count = new int[26];
        boolean[] letters = new boolean[26];
        for (char letter : word2.toCharArray()) {
            int index = letter - 'a';
            if (count[index]++ == 0) {
                letters[index] = true;
                keys++;
            }
        }
        int start = 0;
        int end = 0;
        while (end < len) {
            int index = word1.charAt(end) - 'a';
            if (!letters[index]) {
                end++;
                continue;
            }
            if (--count[index] == 0) {
                --keys;
            }
            while (keys == 0) {
                res += len - end;
                int beginIndex = word1.charAt(start++) - 'a';
                if (!letters[beginIndex]) {
                    continue;
                }
                if (count[beginIndex]++ == 0) {
                    keys++;
                }
            }
            end++;
        }
        return res;
    }
}
