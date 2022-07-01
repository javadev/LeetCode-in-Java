package g0701_0800.s0744_find_smallest_letter_greater_than_target;

// #Easy #Array #Binary_Search #Binary_Search_I_Day_4
// #2022_04_30_Time_0_ms_(100.00%)_Space_47.4_MB_(68.35%)

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        // If target is greater than last element return first element of the array.
        if (letters[letters.length - 1] <= target) {
            return letters[start];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return letters[start];
    }
}
