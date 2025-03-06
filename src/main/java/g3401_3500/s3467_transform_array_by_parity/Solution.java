package g3401_3500.s3467_transform_array_by_parity;

// #Easy #2025_03_06_Time_1_ms_(100.00%)_Space_45.26_MB_(23.27%)

public class Solution {
    public int[] transformArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int countEven = 0;
        for (int num : nums) {
            if ((num & 1) == 0) {
                countEven++;
            }
        }
        for (int i = countEven; i < size; i++) {
            ans[i] = 1;
        }
        return ans;
    }
}
