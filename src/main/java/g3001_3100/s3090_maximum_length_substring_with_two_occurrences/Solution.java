package g3001_3100.s3090_maximum_length_substring_with_two_occurrences;

// #Easy #String #Hash_Table #Sliding_Window #2024_04_18_Time_1_ms_(100.00%)_Space_42.5_MB_(55.33%)

public class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        int i = 0;
        int len = s.length();
        int max = 0;
        for (int j = 0; j < len; j++) {
            ++freq[chars[j] - 'a'];
            while (freq[chars[j] - 'a'] == 3) {
                --freq[chars[i] - 'a'];
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
