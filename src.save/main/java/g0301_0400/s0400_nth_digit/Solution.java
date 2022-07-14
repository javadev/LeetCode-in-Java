package g0301_0400.s0400_nth_digit;

// #Medium #Math #Binary_Search #2022_07_15_Time_0_ms_(100.00%)_Space_39_MB_(95.41%)

public class Solution {
    /*
     * 1. find the length of the number where the nth digit is from
     * 2. find the actual number where the nth digit is from
     * 3. find the nth digit and return
     */
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
