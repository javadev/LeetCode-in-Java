package g2001_2100.s2001_number_of_pairs_of_interchangeable_rectangles;

// #Medium #Array #Hash_Table #Math #Counting #Number_Theory
// #2022_05_22_Time_34_ms_(99.02%)_Space_121.4_MB_(69.27%)

import java.util.Arrays;

public class Solution {
    private long factorial(long n) {
        long m = 0;
        while (n > 0) {
            m += n;
            n = n - 1;
        }
        return m;
    }

    public long interchangeableRectangles(int[][] rec) {
        double[] ratio = new double[rec.length];
        for (int i = 0; i < rec.length; i++) {
            ratio[i] = (double) rec[i][0] / rec[i][1];
        }
        Arrays.sort(ratio);
        long res = 0;
        int k = 0;
        for (int j = 0; j < ratio.length - 1; j++) {
            if (ratio[j] == ratio[j + 1]) {
                k++;
            }
            if (ratio[j] != ratio[j + 1] || j + 2 == ratio.length) {
                res += factorial(k);
                k = 0;
            }
        }
        return res;
    }
}
