package g0401_0500.s0441_arranging_coins;

// #Easy #Math #Binary_Search #Binary_Search_I_Day_6
// #2022_07_16_Time_2_ms_(95.97%)_Space_41.8_MB_(28.06%)

public class Solution {
    public int arrangeCoins(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Input Number is invalid. Only positive numbers are allowed");
        }
        if (n <= 1) {
            return n;
        }
        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }
        // Binary Search space will start from 2 to n/2.
        long start = 2;
        long end = n / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n) {
                return (int) mid;
            }
            if (coinsFilled < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Since at this point start > end, start will start pointing to a value greater
        // than the desired result. We will return end as it will point to the correct
        // int value.
        return (int) end;
    }
}
