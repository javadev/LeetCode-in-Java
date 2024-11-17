package g0301_0400.s0394_decode_string;

// #Medium #Top_100_Liked_Questions #String #Stack #Recursion #Level_1_Day_14_Stack #Udemy_Strings
// #Big_O_Time_O(n)_Space_O(n) #2024_11_17_Time_0_ms_(100.00%)_Space_41.5_MB_(58.38%)

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
