package g0801_0900.s0831_masking_personal_information;

// #Medium #String #2022_03_24_Time_1_ms_(84.30%)_Space_42.1_MB_(63.64%)

public class Solution {
    public String maskPII(String s) {
        StringBuilder masked = new StringBuilder();
        if (Character.isAlphabetic(s.charAt(0))) {
            int locationOfAtSymbol = s.indexOf("@") - 1;
            masked.append(s.charAt(0)).append("*****").append(s.substring(locationOfAtSymbol));
            return masked.toString().toLowerCase();
        } else {
            StringBuilder allDigits = new StringBuilder();
            int pointer = -1;
            while (++pointer < s.length()) {
                if (Character.isDigit(s.charAt(pointer))) {
                    allDigits.append(s.charAt(pointer));
                }
            }
            int numDigits = allDigits.length();
            if (numDigits == 11) {
                masked.append("+*-");
            } else if (numDigits == 12) {
                masked.append("+**-");
            } else if (numDigits == 13) {
                masked.append("+***-");
            }
            masked.append("***-***-").append(allDigits.substring(numDigits - 4));
            return masked.toString();
        }
    }
}
