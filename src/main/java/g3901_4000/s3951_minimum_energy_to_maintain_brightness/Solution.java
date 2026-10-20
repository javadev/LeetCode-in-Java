package g3901_4000.s3951_minimum_energy_to_maintain_brightness;

// #Medium #Array #Sorting #Senior #Biweekly_Contest_184
// #2026_10_20_Time_10_ms_(100.00%)_Space_189.60_MB_(91.67%)

import java.util.Arrays;

@SuppressWarnings("java:S1172")
public class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int st = 0;
        int ed = -1;
        int tot = 0;
        for (var a : intervals) {
            if (a[0] <= ed) {
                if (a[1] > ed) {
                    ed = a[1];
                }
            } else {
                tot += ed - st + 1;
                st = a[0];
                ed = a[1];
            }
        }
        tot += ed - st + 1;
        return (long) tot * ((brightness + 2) / 3);
    }
}
