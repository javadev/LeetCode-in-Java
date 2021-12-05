package g0001_0100.s0008_string_to_integer_atoi;

public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int i = 0;
        boolean negetiveSign = false;
        char[] input = str.toCharArray();

        while (i < input.length && input[i] == ' ') {
            i++;
        }

        if (i == input.length) {
            return 0;
        } else if (input[i] == '+') {
            i++;
        } else if (input[i] == '-') {
            i++;
            negetiveSign = true;
        }

        int num = 0;
        while (i < input.length && input[i] <= '9' && input[i] >= '0') {
            int tem = input[i] - '0'; // current char
            tem = negetiveSign ? -tem : tem;

            if (num == 0 && tem == '0') { // avoid invalid number like 038
                i++;
            } else if (num == Integer.MIN_VALUE / 10 && tem <= -8 || num < Integer.MIN_VALUE / 10) {
                return Integer.MIN_VALUE;
            } else if (num == Integer.MAX_VALUE / 10 && tem >= 7 || num > Integer.MAX_VALUE / 10) {
                return Integer.MAX_VALUE;
            } else {
                num = num * 10 + tem;
                i++;
            }
        }
        return num;
    }
}
