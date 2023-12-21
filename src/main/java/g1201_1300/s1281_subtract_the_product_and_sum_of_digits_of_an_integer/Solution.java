package g1201_1300.s1281_subtract_the_product_and_sum_of_digits_of_an_integer;

// #Easy #Math #Programming_Skills_I_Day_2_Operator
// #2022_03_12_Time_0_ms_(100.00%)_Space_41.8_MB_(5.71%)

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n /= 10;
        }
        return product - sum;
    }
}
