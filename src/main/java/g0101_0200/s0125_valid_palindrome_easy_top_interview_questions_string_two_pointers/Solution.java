package g0101_0200.s0125_valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean res = true;
        while (res) {
            // Iterates through string to find first char which is alphanumeric.
            // Done to ignore non-alphanumeric characters.
            // Starts from 0 to j-1.
            while (i < j && isNotAlphaNumeric(s.charAt(i))) {
                i++;
            }
            // Similarly from j-1 to 0.
            while (i < j && isNotAlphaNumeric(s.charAt(j))) {
                j--;
            }
            // Checks if i is greater than or equal to j.
            // The main loop only needs to loop n / 2 times hence this condition (where n is string
            // length).
            if (i >= j) {
                break;
            }
            // Assigning found indices to variables.
            // The upperToLower function is used to convert characters, if upper case, to lower
            // case.
            // If already lower case, it'll return as it is.
            char left = upperToLower(s.charAt(i));
            char right = upperToLower(s.charAt(j));
            // If both variables are not same, result becomes false, and breaks out of the loop at
            // next iteration.
            if (left != right) {
                res = false;
            }
            i++;
            j--;
        }
        return res;
    }

    private boolean isNotAlphaNumeric(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }

    private boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private char upperToLower(char c) {
        if (isUpper(c)) {
            c = (char) (c + 32);
        }
        return c;
    }
}
