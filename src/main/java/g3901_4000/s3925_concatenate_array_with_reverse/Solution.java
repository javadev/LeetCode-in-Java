package g3901_4000.s3925_concatenate_array_with_reverse;

// #Easy #Array #Simulation #Mid_Level #Weekly_Contest_501
// #2026_09_29_Time_1_ms_(97.85%)_Space_47.45_MB_(24.79%)

public class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            count++;
        }
        for (int i = n - 1; i >= 0; i--) {
            ans[count++] = nums[i];
        }
        return ans;
    }
}
