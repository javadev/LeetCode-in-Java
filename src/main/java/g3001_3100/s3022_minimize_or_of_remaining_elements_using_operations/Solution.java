package g3001_3100.s3022_minimize_or_of_remaining_elements_using_operations;

// #Hard #Array #Greedy #Bit_Manipulation #2024_02_29_Time_43_ms_(78.48%)_Space_56.6_MB_(23.73%)

public class Solution {
    public int minOrAfterOperations(int[] nums, int k) {
        int ans = 0;
        int mask = 0;
        for (int j = 30; j >= 0; j--) {
            mask = mask | (1 << j);
            int consecutiveAnd = mask;
            int mergeCount = 0;
            for (int i : nums) {
                consecutiveAnd = consecutiveAnd & i;
                if ((consecutiveAnd | ans) != ans) {
                    mergeCount++;
                } else {
                    consecutiveAnd = mask;
                }
            }
            if (mergeCount > k) {
                ans |= (1 << j);
            }
        }
        return ans;
    }
}
