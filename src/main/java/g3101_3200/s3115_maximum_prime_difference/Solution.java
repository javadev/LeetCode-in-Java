package g3101_3200.s3115_maximum_prime_difference;

// #Medium #Array #Math #Number_Theory #2024_04_27_Time_1_ms_(99.91%)_Space_79.5_MB_(32.00%)

public class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n && !check(nums[i])) {
            i++;
        }
        int j = n - 1;
        while (j >= 0 && !check(nums[j])) {
            j--;
        }
        return j - i;
    }

    private boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
