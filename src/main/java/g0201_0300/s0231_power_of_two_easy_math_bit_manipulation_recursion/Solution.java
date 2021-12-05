package g0201_0300.s0231_power_of_two;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
    }
}
