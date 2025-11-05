package g3701_3800.s3732_maximum_product_of_three_elements_after_one_replacement;

// #Medium #Array #Math #Sorting #Greedy #Weekly_Contest_474
// #2025_11_05_Time_4_ms_(95.32%)_Space_97.32_MB_(28.84%)

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
