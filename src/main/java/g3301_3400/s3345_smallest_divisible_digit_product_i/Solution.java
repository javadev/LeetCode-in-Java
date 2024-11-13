package g3301_3400.s3345_smallest_divisible_digit_product_i;

// #Easy #Math #Enumeration #2024_11_13_Time_0_ms_(100.00%)_Space_41.2_MB_(29.77%)

public class Solution {
    public int smallestNumber(int n, int t) {
        int num = -1;
        int check = n;
        while (num == -1) {
            int product = findProduct(check);
            if (product % t == 0) {
                num = check;
            }
            check += 1;
        }
        return num;
    }

    private int findProduct(int check) {
        int res = 1;
        while (check > 0) {
            res *= check % 10;
            check = check / 10;
        }
        return res;
    }
}
