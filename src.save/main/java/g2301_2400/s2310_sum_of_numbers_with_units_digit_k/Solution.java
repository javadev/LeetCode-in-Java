package g2301_2400.s2310_sum_of_numbers_with_units_digit_k;

// #Medium #Math #2022_06_20_Time_1_ms_(66.67%)_Space_41.5_MB_(33.33%)

public class Solution {
    public int minimumNumbers(int nums, int k) {
        // Base Case Check
        if (nums == 0) {
            return 0;
        }
        int x = nums % 10;
        for (int i = 1; i <= 10; i++) {
            // check if the unit digits are equal for any case and if n>k*i
            if ((k * i) % 10 == x && nums >= k * i) {
                return i;
            }
        }
        // in case nothing matches
        return -1;
    }
}
