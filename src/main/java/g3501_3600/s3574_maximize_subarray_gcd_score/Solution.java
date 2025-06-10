package g3501_3600.s3574_maximize_subarray_gcd_score;

// #Hard #Array #Math #Enumeration #Number_Theory
// #2025_06_10_Time_13_ms_(100.00%)_Space_45.07_MB_(78.08%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public long maxGCDScore(int[] nums, int k) {
        int mx = 0;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        int width = 32 - Integer.numberOfLeadingZeros(mx);
        List<Integer>[] lowbitPos = new List[width];
        Arrays.setAll(lowbitPos, i -> new ArrayList<>());
        int[][] intervals = new int[width + 1][3];
        int size = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int tz = Integer.numberOfTrailingZeros(x);
            lowbitPos[tz].add(i);
            for (int j = 0; j < size; j++) {
                intervals[j][0] = gcd(intervals[j][0], x);
            }
            intervals[size][0] = x;
            intervals[size][1] = i - 1;
            intervals[size][2] = i;
            size++;
            int idx = 1;
            for (int j = 1; j < size; j++) {
                if (intervals[j][0] != intervals[j - 1][0]) {
                    intervals[idx][0] = intervals[j][0];
                    intervals[idx][1] = intervals[j][1];
                    intervals[idx][2] = intervals[j][2];
                    idx++;
                } else {
                    intervals[idx - 1][2] = intervals[j][2];
                }
            }
            size = idx;
            for (int j = 0; j < size; j++) {
                int g = intervals[j][0];
                int l = intervals[j][1];
                int r = intervals[j][2];
                ans = Math.max(ans, (long) g * (i - l));
                List<Integer> pos = lowbitPos[Integer.numberOfTrailingZeros(g)];
                int minL = pos.size() > k ? Math.max(l, pos.get(pos.size() - k - 1)) : l;
                if (minL < r) {
                    ans = Math.max(ans, (long) g * 2 * (i - minL));
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }
}
