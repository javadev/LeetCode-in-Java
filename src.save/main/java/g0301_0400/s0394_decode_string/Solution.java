package g0301_0400.s0394_decode_string;

// #Medium #Top_100_Liked_Questions #String #Stack #Recursion #Level_1_Day_14_Stack
// #2022_03_16_Time_1_ms_(83.81%)_Space_42.1_MB_(38.87%)

public class Solution {
    private int i = 0;

    public String decodeString(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c);
            } else if (c == ']') {
                break;
            } else if (c == '[') {
                // sub problem
                String repeat = decodeString(s);
                while (count > 0) {
                    sb.append(repeat);
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
