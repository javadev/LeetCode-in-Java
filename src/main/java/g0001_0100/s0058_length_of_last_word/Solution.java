package g0001_0100.s0058_length_of_last_word;

// #Easy #String #Programming_Skills_II_Day_6 #Udemy_Arrays #Top_Interview_150_Array/String
// #2025_03_04_Time_0_ms_(100.00%)_Space_41.72_MB_(64.92%)

public class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ' && len > 0) {
                break;
            } else if (ch != ' ') {
                len++;
            }
        }
        return len;
    }
}
