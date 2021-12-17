package g0301_0400.s0374_guess_number_higher_or_lower;

// #Easy #Binary_Search #Interactive

/*
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the guess number
 *     otherwise return 0 int guess(int num);
 */
public class Solution {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (guess(mid) == 1) {
                left = mid + 1;
            } else if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Assume we pick 7
    private int guess(int num) {
        return Integer.compare(7, num);
    }
}
