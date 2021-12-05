package g0101_0200.s0189_rotate_array;

public class Solution {
    private void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int t = n - (k % n);
        reverse(nums, 0, t - 1);
        reverse(nums, t, n - 1);
        reverse(nums, 0, n - 1);
    }
}
