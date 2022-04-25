package g1701_1800.s1712_ways_to_split_array_into_three_subarrays;

// #Medium #Array #Binary_Search #Two_Pointers #Prefix_Sum #Binary_Search_II_Day_10
// #2022_04_24_Time_16_ms_(84.24%)_Space_78.3_MB_(49.27%)

public class Solution {
    public int waysToSplit(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int cur = 0;
        long res = 0;
        int i = 0;
        int idx1 = 1;
        int sum1 = nums[0];
        int idx2 = 1;
        int sum2 = nums[0];
        while (i < nums.length) {
            cur += nums[i];
            int right = sum - cur;
            if (i == 0 || i == nums.length - 1) {
                i++;
                continue;
            }
            while (idx1 <= i && sum1 <= cur - sum1) {
                sum1 += nums[idx1++];
            }
            while (idx2 < idx1 && cur - sum2 > right) {
                sum2 += nums[idx2++];
            }
            if (idx1 > idx2) {
                res = (res + idx1 - idx2) % 1000_000_007;
            }
            i++;
        }
        return (int) res;
    }
}
