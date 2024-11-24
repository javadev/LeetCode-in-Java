package g3301_3400.s3361_shift_distance_between_two_strings;

// #Medium #2024_11_24_Time_57_ms_(100.00%)_Space_45.7_MB_(100.00%)

public class Solution {
    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        long sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int ch1 = s.charAt(i) - 'a';
            int ch2 = t.charAt(i) - 'a';
            int forwardDiff = (ch2 - ch1 + 26) % 26;
            long forwardCost = 0;
            for (int j = 0; j < forwardDiff; j++) {
                forwardCost += nextCost[(ch1 + j) % 26];
            }
            int reverseDiff = (26 + ch1 - ch2) % 26;
            long backwardCost = 0;
            for (int j = 0; j < reverseDiff; j++) {
                backwardCost += previousCost[(ch1 - j + 26) % 26];
            }
            sum += Math.min(forwardCost, backwardCost);
        }
        return sum;
    }
}
