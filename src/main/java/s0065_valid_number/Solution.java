package s0065_valid_number;

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
                    if (!seenDigit || seenExponent) {
                        return false;
                    } else {
                        seenExponent = true;
                        // Reset seenDigit because at least one digit should come after seeign
                        // exponent
                        // Return statement is returning seenDigit flag
                        seenDigit = false;
                    }
                }

                // Validate there is only one dot
                else if (ch == '.') {
                    // Shouldn't have seen dot before as there can be only one
                    // Shouldn't have see exponent before
                    if (seenDot || seenExponent) {
                        return false;
                    } else {
                        seenDot = true;
                    }
                }

                // Validate sign coming at 0th position or after e/E
                else if (ch == '+' || ch == '-') {
                    // Sign
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
