package g2401_2500.s2451_odd_string_difference;

// #Easy #String #Hash_Table #Math #2022_12_15_Time_0_ms_(100.00%)_Space_40_MB_(91.61%)

public class Solution {
    public String oddString(String[] w) {
        int n = w[0].length() - 1;
        int[] x = new int[n];
        int s = 1;
        int y = 0;
        int index = 1;
        for (int i = 0; i < n; i++) {
            x[i] = w[0].charAt(i + 1) - w[0].charAt(i);
        }
        for (int i = 1; y * s == 0 || s + y < 3; i++) {
            boolean b = true;
            for (int j = 0; j < n; j++) {
                if (x[j] != w[i].charAt(j + 1) - w[i].charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                s++;
            } else {
                y++;
                index = i;
            }
        }
        return s == 1 ? w[0] : w[index];
    }
}
