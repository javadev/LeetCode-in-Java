package g2201_2300.s2299_strong_password_checker_ii;

// #Easy #String #2022_06_15_Time_1_ms_(97.32%)_Space_42.3_MB_(38.52%)

public class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean l = false;
        boolean u = false;
        boolean d = false;
        boolean s = false;
        String special = "!@#$%^&*()-+";
        char previous = '.';
        for (int i = 0; i != password.length(); i++) {
            char ch = password.charAt(i);
            if (ch == previous) {
                return false;
            }
            previous = ch;
            if (ch >= 'A' && ch <= 'Z') {
                u = true;
            } else if (ch >= 'a' && ch <= 'z') {
                l = true;
            } else if (ch >= '0' && ch <= '9') {
                d = true;
            } else if (special.indexOf(ch) != -1) {
                s = true;
            }
        }
        return l && u && d && s;
    }
}
