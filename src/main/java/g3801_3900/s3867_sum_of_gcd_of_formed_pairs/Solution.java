package g3801_3900.s3867_sum_of_gcd_of_formed_pairs;

// #Medium #Array #Math #Sorting #Two_Pointers #Simulation #Number_Theory #Senior
// #Biweekly_Contest_178 #2026_07_28_Time_53_ms_(92.50%)_Space_107.82_MB_(83.19%)

import java.util.Arrays;

public class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(max, nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            sum += gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
