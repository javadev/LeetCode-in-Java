package g3601_3700.s3663_find_the_least_frequent_digit;

// #Easy #Array #Hash_Table #Math #Counting #Biweekly_Contest_164
// #2025_09_26_Time_1_ms_(97.93%)_Space_41.02_MB_(71.15%)

public class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        String numStr = String.valueOf(n);
        for (char c : numStr.toCharArray()) {
            freq[c - '0']++;
        }
        int minFreq = Integer.MAX_VALUE;
        int result = -1;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] == 0) {
                continue;
            }
            if (freq[d] < minFreq) {
                minFreq = freq[d];
                result = d;
            } else if (freq[d] == minFreq && d < result) {
                result = d;
            }
        }
        return result;
    }
}
