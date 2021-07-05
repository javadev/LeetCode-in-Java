package s0012.integer.to.roman;

public class Solution {
    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        int m = 1000;
        int d = 500;
        int c = 100;
        int l = 50;
        int x = 10;
        int v = 5;
        int i = 1;

        num = numerals(sb, num, 0, 0, m, ' ', ' ', 'M');
        num = numerals(sb, num, m, d, c, 'M', 'D', 'C');
        num = numerals(sb, num, c, l, x, 'C', 'L', 'X');
        num = numerals(sb, num, x, v, i, 'X', 'V', 'I');

        return sb.toString();
    }

    public int numerals(
            StringBuilder sb,
            int num,
            int ten,
            int five,
            int one,
            char c_ten,
            char c_five,
            char c_one) {
        int div = num / one;
        switch (div) {
            case 9:
                {
                    sb.append(c_one);
                    sb.append(c_ten);
                    break;
                }
            case 8:
                {
                    sb.append(c_five);
                    sb.append(c_one);
                    sb.append(c_one);
                    sb.append(c_one);
                    break;
                }
            case 7:
                {
                    sb.append(c_five);
                    sb.append(c_one);
                    sb.append(c_one);
                    break;
                }
            case 6:
                {
                    sb.append(c_five);
                    sb.append(c_one);
                    break;
                }
            case 5:
                {
                    sb.append(c_five);
                    break;
                }
            case 4:
                {
                    sb.append(c_one);
                    sb.append(c_five);
                    break;
                }
            case 3:
                {
                    sb.append(c_one);
                    sb.append(c_one);
                    sb.append(c_one);
                    break;
                }
            case 2:
                {
                    sb.append(c_one);
                    sb.append(c_one);
                    break;
                }
            case 1:
                {
                    sb.append(c_one);
                    break;
                }
        }
        return num - (div * one);
    }
}
