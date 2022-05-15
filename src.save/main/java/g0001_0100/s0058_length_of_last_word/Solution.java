package g0001_0100.s0058_length_of_last_word;

// #Easy #String #Acceptance_37.8% #Programming_Skills_II_Day_6
// #2022_02_19_Time_0_ms_(100.00%)_Space_40.4_MB_(32.82%)

public class Solution {
    public int lengthOfLastWord(String str) {
        int len = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ' && len > 0) {
                break;
            } else if (ch != ' ') {
                len++;
            }
        }
        return len;
    }
}
