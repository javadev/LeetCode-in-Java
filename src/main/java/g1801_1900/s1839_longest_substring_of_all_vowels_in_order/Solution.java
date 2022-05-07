package g1801_1900.s1839_longest_substring_of_all_vowels_in_order;

// #Medium #String #Sliding_Window #2022_05_07_Time_24_ms_(86.13%)_Space_58.7_MB_(49.58%)

public class Solution {
    public int longestBeautifulSubstring(String word) {
        int cnt = 1;
        int len = 1;
        int maxLen = 0;
        for (int i = 1; i != word.length(); ++i) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                ++len;
            } else if (word.charAt(i - 1) < word.charAt(i)) {
                ++len;
                ++cnt;
            } else {
                cnt = 1;
                len = 1;
            }

            if (cnt == 5) {
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
