package g0201_0300.s0224_basic_calculator;

public class Solution {
    int i = 0;

    public int calculate(String s) {
        char[] ca = s.toCharArray();

        return helper(ca);
    }

    public int helper(char[] ca) {
        int num = 0;
        int prenum = 0;
        boolean isPlus = true;
        for (; i < ca.length; i++) {
            char c = ca[i];
            if (c == ' ') {
                continue;
            } else if (c >= '0' && c <= '9') {
                if (num == 0) {
                    num = ((int) c - (int) '0');
                } else {
                    num = num * 10 + (int) c - (int) '0';
                }
            } else if (c == '+') {
                prenum += num * (isPlus ? 1 : -1);
                isPlus = true;
                num = 0;
            } else if (c == '-') {
                prenum += num * (isPlus ? 1 : -1);
                isPlus = true;
                num = 0;
                isPlus = false;
            } else if (c == '(') {
                i++;
                prenum += helper(ca) * (isPlus ? 1 : -1);
                isPlus = true;
                num = 0;
            } else if (c == ')') {
                return prenum + num * (isPlus ? 1 : -1);
            }
        }
        return prenum + num * (isPlus ? 1 : -1);
    }
}
