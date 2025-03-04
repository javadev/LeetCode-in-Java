package g0001_0100.s0027_remove_element;

// #Easy #Array #Two_Pointers #Top_Interview_150_Array/String
// #2025_03_04_Time_0_(100.00%)_Space_42.15_(29.50%)

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int j = len - 1;
        int occurTimes = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                occurTimes++;
                if (j == i) {
                    return len - occurTimes;
                }
                while (nums[j] == val) {
                    j--;
                    occurTimes++;
                    if (j == i) {
                        return len - occurTimes;
                    }
                }
                nums[i] = nums[j];
                j--;
            }
            if (i == j) {
                return len - occurTimes;
            }
        }
        return len - occurTimes;
    }
}
