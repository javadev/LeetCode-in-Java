package g0701_0800.s0744_find_smallest_letter_greater_than_target;

// #Easy #Array #Binary_Search

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target) {
            return letters[0];
        }
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                while (letters[mid] > target) {
                    mid--;
                }
                return letters[++mid];
            } else {
                left = mid + 1;
            }
        }
        if (right < letters.length && letters[right] > target) {
            return letters[right];
        }
        return letters[0];
    }
}
