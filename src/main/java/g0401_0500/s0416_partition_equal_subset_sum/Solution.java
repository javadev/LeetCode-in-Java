package g0401_0500.s0416_partition_equal_subset_sum;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Level_2_Day_13_Dynamic_Programming
// #Big_O_Time_O(n*sums)_Space_O(n*sums) #2024_11_17_Time_5_ms_(99.88%)_Space_42.2_MB_(85.79%)

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum /= 2;
        boolean[] set = new boolean[sum + 1];
        int[] arr = new int[sum + 2];
        int top = 0;
        for (int val : nums) {
            for (int i = top; i > -1; i--) {
                int tempSum = val + arr[i];
                if (tempSum <= sum && !set[tempSum]) {
                    if (tempSum == sum) {
                        return true;
                    }
                    set[tempSum] = true;
                    arr[++top] = tempSum;
                }
            }
        }
        return false;
    }
}
