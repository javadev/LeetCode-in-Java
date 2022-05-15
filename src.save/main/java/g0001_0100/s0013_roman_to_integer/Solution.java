package g0001_0100.s0013_roman_to_integer;

// #Easy #Top_Interview_Questions #String #Hash_Table #Math #Acceptance_57.9%
// #2022_02_17_Time_5_ms_(82.08%)_Space_45_MB_(29.21%)

public class Solution {
    public int romanToInt(String s) {
        int x = 0;
        char y;
        for (int i = 0; i < s.length(); i++) {
            y = s.charAt(i);
            switch (y) {
                case 'I':
                    x = getX(s, x, i, 1, 'V', 'X');
                    break;
                case 'V':
                    x += 5;
                    break;
                case 'X':
                    x = getX(s, x, i, 10, 'L', 'C');
                    break;
                case 'L':
                    x += 50;
                    break;
                case 'C':
                    x = getX(s, x, i, 100, 'D', 'M');
                    break;
                case 'D':
                    x += 500;
                    break;
                case 'M':
                    x += 1000;
                    break;
                default:
                    break;
            }
        }
        return x;
    }

    private int getX(String s, int x, int i, int i2, char v, char x2) {
        if (i + 1 == s.length()) {
            x += i2;
        } else if (s.charAt(i + 1) == v) {
            x -= i2;
        } else if (s.charAt(i + 1) == x2) {
            x -= i2;
        } else {
            x += i2;
        }
        return x;
    }
}
