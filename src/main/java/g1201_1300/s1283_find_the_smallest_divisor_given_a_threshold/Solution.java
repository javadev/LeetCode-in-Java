package g1201_1300.s1283_find_the_smallest_divisor_given_a_threshold;

// #Medium #Array #Binary_Search #Binary_Search_II_Day_5
// #2022_03_11_Time_9_ms_(95.49%)_Space_56.5_MB_(8.70%)

public class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 1000000;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (helper(mid, nums) > threshold) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private int helper(int mid, int[] nums) {
        int res = 0;
        for (int num : nums) {
            res += (num + mid - 1) / mid;
        }
        return res;
    }
}
