package g3601_3700.s3666_minimum_operations_to_equalize_binary_string;

// #Hard #Biweekly_Contest_164 #2025_08_31_Time_22_ms_(100.00%)_Space_45.62_MB_(100.00%)

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int minOperations(String s, int k) {
        int zeros = s.chars().map(x -> x == '0' ? 1 : 0).sum();
        if ((zeros % k) == 0) {
            return zeros / k;
        }
        int n = s.length();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(zeros);
        int res = 1;
        // use bounds for optimization
        int[][] bounds = new int[2][2];
        bounds[zeros & 1][0] = bounds[zeros & 1][1] = zeros;
        bounds[1 - (zeros & 1)][0] = Integer.MAX_VALUE;
        bounds[1 - (zeros & 1)][1] = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            // find min number of zeros and max number of zeros in this round
            int minv = Integer.MAX_VALUE;
            int maxv = Integer.MIN_VALUE;
            for (int len = q.size(); len > 0; len--) {
                int h = q.poll();
                int t = n - h;
                int x = Math.min(h, k);
                if (t >= k - x) {
                    int fst = h - x + (k - x);
                    minv = Math.min(minv, fst);
                    maxv = Math.max(maxv, fst);
                }
                x = Math.min(t, k);
                if (h >= k - x) {
                    int snd = h - (k - x) + x;
                    minv = Math.min(minv, snd);
                    maxv = Math.max(maxv, snd);
                }
            }
            // possible children are sequence of equal difference 2
            int ind = minv & 1;
            int temp = minv;
            while (temp <= maxv) {
                if ((temp % k) == 0) {
                    return res + temp / k;
                }
                if (temp < bounds[ind][0] || temp > bounds[ind][1]) {
                    q.add(temp);
                    temp += 2;
                } else {
                    temp = bounds[ind][1] + 2;
                }
            }
            bounds[ind][0] = Math.min(bounds[ind][0], minv);
            bounds[ind][1] = Math.max(bounds[ind][1], maxv);
            res++;
        }
        return -1;
    }
}
