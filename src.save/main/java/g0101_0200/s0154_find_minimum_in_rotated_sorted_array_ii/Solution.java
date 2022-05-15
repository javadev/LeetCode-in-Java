package g0101_0200.s0154_find_minimum_in_rotated_sorted_array_ii;

// #Hard #Array #Binary_Search #Acceptance_43.3% #Binary_Search_II_Day_13
// #2022_02_23_Time_0_ms_(100.00%)_Space_41.8_MB_(40.58%)

public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return find(0, nums.length - 1, nums);
    }

    private int find(int left, int right, int[] nums) {
        if (left + 1 >= right) {
            return Math.min(nums[left], nums[right]);
        }
        int mid = left + (right - left) / 2;
        if (nums[left] == nums[right] && nums[left] == nums[mid]) {
            return Math.min(find(left, mid, nums), find(mid, right, nums));
        }
        if (nums[left] >= nums[right]) {
            if (nums[mid] >= nums[left]) {
                return find(mid, right, nums);
            } else {
                return find(left, mid, nums);
            }
        } else {
            return find(left, mid, nums);
        }
    }
}
