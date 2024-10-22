package g3301_3400.s3325_count_substrings_with_k_frequency_characters_i;

// #Medium #String #Hash_Table #Sliding_Window #2024_10_22_Time_1_ms_(100.00%)_Space_42_MB_(98.69%)

public class Solution {
    public int numberOfSubstrings(String s, int k) {
        int left = 0;
        int result = 0;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;

            while (count[ch - 'a'] == k) {
                result += s.length() - i;
                char atLeft = s.charAt(left);
                count[atLeft - 'a']--;
                left++;
            }
        }
        return result;
    }
}
