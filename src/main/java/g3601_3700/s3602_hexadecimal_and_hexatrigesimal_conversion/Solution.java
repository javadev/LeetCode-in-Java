package g3601_3700.s3602_hexadecimal_and_hexatrigesimal_conversion;

// #Easy #String #Math #2025_07_08_Time_2_ms_(100.00%)_Space_42.19_MB_(96.97%)

public class Solution {
    public String concatHex36(int n) {
        int t = n * n;
        int k;
        StringBuilder st = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        while (t > 0) {
            k = t % 16;
            t = t / 16;
            if (k <= 9) {
                tmp.append((char) ('0' + k));
            } else {
                tmp.append((char) ('A' + (k - 10)));
            }
        }
        for (int i = tmp.length() - 1; i >= 0; i--) {
            st.append(tmp.charAt(i));
        }
        tmp = new StringBuilder();
        t = n * n * n;
        while (t > 0) {
            k = t % 36;
            t = t / 36;
            if (k <= 9) {
                tmp.append((char) ('0' + k));
            } else {
                tmp.append((char) ('A' + (k - 10)));
            }
        }
        for (int i = tmp.length() - 1; i >= 0; i--) {
            st.append(tmp.charAt(i));
        }
        return st.toString();
    }
}
