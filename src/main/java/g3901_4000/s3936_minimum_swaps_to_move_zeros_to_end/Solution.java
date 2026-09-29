package g3901_4000.s3936_minimum_swaps_to_move_zeros_to_end;

// #Easy #Array #Two_Pointers #Mid_Level #Biweekly_Contest_183
// #2026_09_29_Time_1_ms_(99.59%)_Space_46.22_MB_(83.18%)

public class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (nums[l] == 0 && nums[r] != 0) {
                swap(nums, l, r);
                count++;
                l++;
                r--;
            } else if (nums[l] != 0) {
                l++;
            } else if (nums[r] == 0) {
                r--;
            }
        }
        return count;
    }
}
