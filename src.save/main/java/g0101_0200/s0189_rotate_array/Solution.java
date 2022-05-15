package g0101_0200.s0189_rotate_array;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Math #Two_Pointers
// #Acceptance_38.6% #Algorithm_I_Day_2_Two_Pointers
// #2022_03_04_Time_1_ms_(83.21%)_Space_64.2_MB_(43.99%)

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
