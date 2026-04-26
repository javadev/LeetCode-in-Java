package g3701_3800.s3746_minimum_string_length_after_balanced_removals;

// #Medium #String #Stack #Counting #Senior #Weekly_Contest_476
// #2026_04_26_Time_3_ms_(95.94%)_Space_47.34_MB_(25.76%)

public class Solution {
    public int minLengthAfterRemovals(String s) {
        int[] hash = new int[2];
        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        return Math.abs(hash[0] - hash[1]);
    }
}
