package g1501_1600.s1556_thousand_separator;

// #Easy #String #2022_04_11_Time_1_ms_(57.92%)_Space_41.7_MB_(31.67%)

public class Solution {
    public String thousandSeparator(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int i = str.length() - 1;
        int j = 1;
        while (i >= 0) {
            sb.append(str.charAt(i));
            j++;
            if (j % 3 == 0) {
                sb.append(".");
            }
            i--;
            j++;
        }
        String result = sb.reverse().toString();
        if (result.charAt(0) == '.') {
            result = result.substring(1);
        }
        return result;
    }
}
