package g0801_0900.s0806_number_of_lines_to_write_string;

// #Easy #Array #String

public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0;
        int line = 0;
        int i = 0;
        while (i < s.length()) {
            count += widths[s.charAt(i) - 'a'];
            if (count == 100) {
                line++;
                count = 0;
            }
            if (count > 100) {
                line++;
                i--;
                count = 0;
            }
            i++;
        }
        if (count > 0 && count < 100) {
            line++;
        }
        if (count == 0) {
            count = 100;
        }
        return new int[] {line, count};
    }
}
