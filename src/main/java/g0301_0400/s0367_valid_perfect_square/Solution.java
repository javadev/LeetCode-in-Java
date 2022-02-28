package g0301_0400.s0367_valid_perfect_square;

// #Easy #Math #Binary_Search

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0) {
            // If num is 0 return false
            return false;
        }
        // long datatype can holds huge number.
        long start = 0;
        long end = num;
        long mid = 0;
        while (start <= end) {
            // until start is lesser or equal to end do this
            // Finding middle value
            mid = start + (end - start) / 2;
            if (mid * mid == num) {
                // if mid*mid == num return true
                return true;
            } else if (mid * mid < num) {
                // if num is greater than mid*mid then make start = mid + 1
                start = mid + 1;
            } else if (mid * mid > num) {
                // if num is lesser than mid*mid then make end = mid - 1
                end = mid - 1;
            }
        }
        return false;
    }
}
