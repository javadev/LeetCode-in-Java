package g0701_0800.s0704_binary_search;

// #Easy #Top_100_Liked_Questions #Array #Binary_Search #Algorithm_I_Day_1_Binary_Search
// #Binary_Search_I_Day_1 #Level_1_Day_7_Binary_Search #Udemy_Binary_Search
// #2022_03_23_Time_0_ms_(100.00%)_Space_54.8_MB_(20.10%)

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target < nums[left] || target > nums[right]) {
            return -1;
        }
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
