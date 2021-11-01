package s0013_roman_to_integer;

public class Solution {
    public int romanToInt(String s) {
        int x = 0;
        char y;
        for (int i = 0; i < s.length(); i++) {
            y = s.charAt(i);
            switch (y) {
                case 'I':
                    if (i + 1 == s.length()) {
                        x += 1;
                    } else if (s.charAt(i + 1) == 'V') {
                        x -= 1;
                    } else if (s.charAt(i + 1) == 'X') {
                        x -= 1;
                    } else {
                        x += 1;
                    }
                    break;
                case 'V':
                    x += 5;
                    break;
                case 'X':
                    if (i + 1 == s.length()) {
                        x += 10;
                    } else if (s.charAt(i + 1) == 'L') {
                        x -= 10;
                    } else if (s.charAt(i + 1) == 'C') {
                        x -= 10;
                    } else {
                        x += 10;
                    }
                    break;
                case 'L':
                    x += 50;
                    break;
                case 'C':
                    if (i + 1 == s.length()) {
                        x += 100;
                    } else if (s.charAt(i + 1) == 'D') {
                        x -= 100;
                    } else if (s.charAt(i + 1) == 'M') {
                        x -= 100;
                    } else {
                        x += 100;
                    }
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
}
