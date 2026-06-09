package g3801_3900.s3819_rotate_non_negative_elements;

// #Medium #Array #Simulation #Senior #Weekly_Contest_486
// #2026_06_09_Time_11_ms_(100.00%)_Space_265.42_MB_(74.38%)

public class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int m = 0;
        int[] a = new int[n];
        for (int x : nums) {
            if (x >= 0) {
                a[m++] = x;
            }
        }
        if (m == 0) {
            return nums;
        }
        k %= m;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                int index = (j + k) % m;
                nums[i] = a[index];
                j++;
            }
        }
        return nums;
    }
}
