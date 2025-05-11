package g3501_3600.s3545_minimum_deletions_for_at_most_k_distinct_characters;

// #Easy #2025_05_11_Time_1_ms_(100.00%)_Space_42.24_MB_(99.10%)

public class Solution {
    public int minDeletion(String s, int k) {
        int n = s.length();
        int count = 0;
        int[] carr = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            carr[ch - 'a']++;
        }
        int dischar = 0;
        for (int i = 0; i < 26; i++) {
            if (carr[i] > 0) dischar++;
        }
        while (dischar > k) {
            int minF = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < 26; i++) {
                if ((carr[i] > 0) && minF > carr[i]) {
                    minF = carr[i];
                    idx = i;
                }
            }
            count += minF;
            carr[idx] = 0;
            dischar--;
        }
        return count;
    }
}
