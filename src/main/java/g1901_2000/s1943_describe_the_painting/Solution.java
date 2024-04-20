package g1901_2000.s1943_describe_the_painting;

// #Medium #Array #Prefix_Sum #2022_05_16_Time_29_ms_(93.92%)_Space_127.4_MB_(75.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        List<List<Long>> result = new ArrayList<>();
        int n = 1;
        for (int[] s : segments) {
            n = Math.max(n, s[1]);
        }
        n += 1;
        long[] line = new long[n];
        boolean[] endpoint = new boolean[n];
        for (int[] s : segments) {
            int start = s[0];
            int end = s[1];
            int color = s[2];
            line[start] += color;
            line[end] -= color;
            endpoint[start] = endpoint[end] = true;
        }
        long mixedColor = 0;
        int start = 1;
        for (int end = 1; end < n; end++) {
            if (endpoint[end]) {
                if (mixedColor > 0) {
                    result.add(Arrays.asList((long) start, (long) end, mixedColor));
                }
                start = end;
            }
            mixedColor += line[end];
        }
        return result;
    }
}
