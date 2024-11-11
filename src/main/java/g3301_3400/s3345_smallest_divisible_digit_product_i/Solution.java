package g3301_3400.s3345_smallest_divisible_digit_product_i;

// #Easy #2024_11_12_Time_1_ms_(59.15%)_Space_40.5_MB_(98.74%)

public class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; i < 101; i++) {
            if (digProduct(i) % t == 0) {
                return i;
            }
        }
        return -1;
    }

    private int digProduct(int n) {
        int pro = 1;
        while (n > 0) {
            pro *= n % 10;
            n /= 10;
        }
        return pro;
    }
}
