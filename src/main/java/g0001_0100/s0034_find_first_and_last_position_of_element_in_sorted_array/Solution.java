package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search
// #Algorithm_II_Day_1_Binary_Search #Binary_Search_I_Day_5
// #2022_02_18_Time_1_ms_(30.87%)_Space_47.1_MB_(20.91%)

@SuppressWarnings("unused")
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] ans = new int[2];
        ans[0] = helper(nums, target, false);
        ans[1] = helper(nums, target, true);
        return ans;
    }

    private int helper(int[] nums, int target, boolean equals) {
        int l = 0;
        int r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid;
            }

            if (nums[mid] < target || (nums[mid] == target && equals)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }
}
