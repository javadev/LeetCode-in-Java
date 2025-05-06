package g3501_3600.s3536_maximum_product_of_two_digits;

// #Easy #Math #Sorting #2025_05_06_Time_1_ms_(95.82%)_Space_40.95_MB_(91.71%)

public class Solution {
    public int maxProduct(int n) {
        int m1 = n % 10;
        n /= 10;
        int m2 = n % 10;
        n /= 10;
        while (n > 0) {
            int a = n % 10;
            if (a > m1) {
                if (m1 > m2) {
                    m2 = m1;
                }
                m1 = a;
            } else {
                if (a > m2) {
                    m2 = a;
                }
            }
            n /= 10;
        }
        return m1 * m2;
    }
}
