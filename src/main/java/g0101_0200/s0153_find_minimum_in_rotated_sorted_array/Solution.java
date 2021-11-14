package g0101_0200.s0153_find_minimum_in_rotated_sorted_array;

public class Solution {
    private int findMinUtil(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int mid = (l + r) / 2;
        if (mid == l && nums[mid] < nums[r]) {
            return nums[l];
        }
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return nums[mid];
        }
        if (nums[mid] < nums[l]) {
            return findMinUtil(nums, l, mid - 1);
        } else if (nums[mid] > nums[r]) {
            return findMinUtil(nums, mid + 1, r);
        }
        return findMinUtil(nums, l, mid - 1);
    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return findMinUtil(nums, l, r);
    }
}
