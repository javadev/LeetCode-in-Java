package g4001_4100.s4010_maximize_pair_strength_using_gcd;

// #Easy #Array #Math #Enumeration #Number_Theory #Mid_Level #Weekly_Contest_513
// #2026_11_17_Time_165_ms_(98.84%)_Space_47.01_MB_(19.42%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    private int gcd(int n, int m) {
        while (m != 0) {
            int remainder = n % m;
            n = m;
            m = remainder;
        }
        return n;
    }

    public long maxPairStrength(int[] nums) {
        long maxStrength = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        for (int i = end; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                long product = (long) nums[i] * nums[j];
                if (product <= maxStrength) {
                    break;
                }
                int hcf = gcd(nums[i], nums[j]);
                if (hcf == 0) {
                    continue;
                }
                long currentStrength = (long) (nums[i] / hcf) * (nums[j] / hcf);
                if (currentStrength > maxStrength) {
                    maxStrength = currentStrength;
                }
            }
        }
        return maxStrength;
    }
}
