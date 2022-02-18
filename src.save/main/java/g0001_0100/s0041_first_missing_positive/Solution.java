package g0001_0100.s0041_first_missing_positive;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table
// #2022_02_18_Time_3_ms_(85.60%)_Space_129.5_MB_(14.65%)

public class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length || nums[i] == i + 1) {
                continue;
            }
            dfs(nums, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private void dfs(int[] nums, int val) {
        if (val <= 0 || val > nums.length || val == nums[val - 1]) {
            return;
        }
        int temp = nums[val - 1];
        nums[val - 1] = val;
        dfs(nums, temp);
    }
}
