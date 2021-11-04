package s0058_length_of_last_word;

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
