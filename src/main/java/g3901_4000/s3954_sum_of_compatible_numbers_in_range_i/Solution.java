package g3901_4000.s3954_sum_of_compatible_numbers_in_range_i;

// #Easy #Dynamic_Programming #Bit_Manipulation #Enumeration #Mid_Level #Weekly_Contest_505
// #2026_10_20_Time_1_ms_(100.00%)_Space_42.37_MB_(88.29%)

public class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        int l = k + n;
        int s = n - k;
        if (s < 0) {
            s = 1;
        }
        for (int i = s; i <= l; i++) {
            if ((i & n) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
