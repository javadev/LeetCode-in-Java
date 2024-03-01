package g2801_2900.s2810_faulty_keyboard;

// #Easy #String #Simulation #2023_11_20_Time_3_ms_(96.04%)_Space_44.2_MB_(14.74%)

public class Solution {
    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'i') {
                stringBuilder.reverse();
                continue;
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
