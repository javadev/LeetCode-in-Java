package g1001_1100.s1093_statistics_from_a_large_sample;

// #Medium #Math #Two_Pointers #Probability_and_Statistics
// #2022_02_21_Time_1_ms_(86.00%)_Space_43.8_MB_(22.00%)

public class Solution {
    public double[] sampleStats(int[] count) {
        int l = 0;
        int r = 255;
        int nl = 0;
        int nr = 0;
        int mn = 256;
        int mx = -1;
        int mid1 = 0;
        int mid2 = 0;
        int mode = 0;
        double avg = 0;
        double mid;
        while (l <= r) {
            while (count[l] == 0) {
                l++;
            }
            while (count[r] == 0) {
                r--;
            }
            if (nl < nr) {
                avg += (double) count[l] * l;
                nl += count[l];
                if (count[l] > count[mode]) {
                    mode = l;
                }
                mx = Math.max(mx, l);
                mn = Math.min(mn, l);
                mid1 = l;
                l++;
            } else {
                avg += (double) count[r] * r;
                nr += count[r];
                if (count[r] > count[mode]) {
                    mode = r;
                }
                mx = Math.max(mx, r);
                mn = Math.min(mn, r);
                mid2 = r;
                r--;
            }
        }
        avg /= nl + nr;
        // Find median
        if (nl < nr) {
            mid = mid2;
        } else if (nl > nr) {
            mid = mid1;
        } else {
            mid = (double) (mid1 + mid2) / 2;
        }
        return new double[] {mn, mx, avg, mid, mode};
    }
}
