package g0501_0600.s0540_single_element_in_a_sorted_array;

// #Medium #Array #Binary_Search #Binary_Search_II_Day_9
// #2022_08_02_Time_0_ms_(100.00%)_Space_60.5_MB_(44.30%)

public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 < nums.length
                    && nums[mid] != nums[mid + 1]
                    && mid - 1 >= 0
                    && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if (mid + 1 < nums.length && nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                start = mid + 1;
            } else if (mid - 1 >= 0 && nums[mid] == nums[mid - 1] && mid % 2 == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
