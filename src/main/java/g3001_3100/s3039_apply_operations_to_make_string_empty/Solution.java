package g3001_3100.s3039_apply_operations_to_make_string_empty;

// #Medium #Array #Hash_Table #Sorting #Counting
// #2024_03_04_Time_18_ms_(93.00%)_Space_48.3_MB_(94.05%)

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        char[] ar = s.toCharArray();
        int n = ar.length;
        int max = 1;
        StringBuilder sb = new StringBuilder();
        for (char c : ar) {
            freq[c - 'a']++;
            max = Math.max(freq[c - 'a'], max);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (freq[ar[i] - 'a'] == max) {
                sb.append(ar[i]);
                freq[ar[i] - 'a'] = 0;
            }
        }
        return sb.reverse().toString();
    }
}
