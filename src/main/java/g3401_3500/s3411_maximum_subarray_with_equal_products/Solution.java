package g3401_3500.s3411_maximum_subarray_with_equal_products;

// #Easy #Array #Math #Sliding_Window #Enumeration #Number_Theory
// #2025_01_07_Time_3_ms_(91.26%)_Space_42.68_MB_(64.20%)

public class Solution {
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxL = 0;
        for (int i = 0; i < n; i++) {
            int currGCD = nums[i];
            int currLCM = nums[i];
            int currPro = nums[i];
            for (int j = i + 1; j < n; j++) {
                currPro *= nums[j];
                currGCD = gcd(currGCD, nums[j]);
                currLCM = lcm(currLCM, nums[j]);
                if (currPro == currLCM * currGCD) {
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }
        return maxL;
    }
}
