package g3701_3800.s3732_maximum_product_of_three_elements_after_one_replacement;

// #Medium #Weekly_Contest_474 #2025_11_02_Time_4_ms_(100.00%)_Space_96.67_MB_(_%)

public class Solution {
    public long maxProduct(int[] nums) {
        long a = 0;
        long b = 0;
        for (int x : nums) {
            long ax = Math.abs(x);
            if (ax >= a) {
                b = a;
                a = ax;
            } else if (ax > b) {
                b = ax;
            }
        }
        return 100000L * a * b;
    }
}
