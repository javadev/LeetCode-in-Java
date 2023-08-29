package g1601_1700.s1658_minimum_operations_to_reduce_x_to_zero;

// #Medium #Array #Hash_Table #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_04_23_Time_4_ms_(98.95%)_Space_97.8_MB_(46.33%)

public class Solution {
    public int minOperations(int[] nums, int x) {
        int totalArraySum = 0;
        for (int each : nums) {
            totalArraySum += each;
        }
        if (totalArraySum == x) {
            return nums.length;
        }
        int target = totalArraySum - x;
        // as we need to find value equal to x so that x-x=0,
        // and we need to search the longest sub array with sum equal t0 total array sum -x;
        int sum = 0;
        int result = -1;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum > target && start < nums.length) {
                sum -= nums[start];
                start++;
            }
            if (sum == target) {
                result = Math.max(result, end + 1 - start);
            }
        }
        if (result == -1) {
            return result;
        } else {
            return nums.length - result;
        }
    }
}
