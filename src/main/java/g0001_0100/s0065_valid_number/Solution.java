package g0001_0100.s0065_valid_number;

public class Solution {
    public boolean isNumber(String s) {
        // Variables
        boolean seenDigit = false;
        boolean seenExponent = false;
        boolean seenDot = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                seenDigit = true;
            } else {
                // Check Exponent logic
                if (ch == 'e' || ch == 'E') {
                    // Should have seen at least one digit before
                    // Shouldn't see exponent > 1 time
                    if (seenDigit && !seenExponent) {
                        seenExponent = true;
                        // Reset seenDigit because at least one digit should come after seeing
                        // exponent
                        // Return statement is returning seenDigit flag
                        seenDigit = false;
                    } else {
                        return false;
                    }
                } else if (ch == '.') {
                    // Validate there is only one dot
                    // Shouldn't have seen dot before as there can be only one
                    // Shouldn't have see exponent before
                    if (seenDot || seenExponent) {
                        return false;
                    } else {
                        seenDot = true;
                    }
                } else if (ch == '+' || ch == '-') {
                    // Validate sign coming at 0th position or after e/E
                    // Sign can only come at starting or after e
                    // That's the reason sign check do at the end
                    if (!(i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return seenDigit;
    }
}
