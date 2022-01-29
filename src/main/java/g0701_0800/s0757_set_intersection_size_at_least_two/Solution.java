package g0701_0800.s0757_set_intersection_size_at_least_two;

// #Hard #Array #Sorting #Greedy

import java.util.Arrays;

public class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int n = 0;
        long[] endStartPairs = new long[intervals.length];
        for (int[] interval : intervals) {
            endStartPairs[n] = (long) (-interval[0]) & 0xFFFFFFFFL;
            endStartPairs[n++] |= (long) (interval[1]) << 32;
        }
        Arrays.sort(endStartPairs);
        int min = -2, max = -1;
        int curStart, curEnd;
        int res = 0;
        for (long endStartPair : endStartPairs) {
            curStart = -(int) endStartPair;
            curEnd = (int) (endStartPair >> 32);
            if (curStart <= min) {
                continue;
            }
            if (curStart <= max) {
                res += 1;
                min = max;
            } else {
                res += 2;
                min = curEnd - 1;
            }
            max = curEnd;
        }
        return res;
    }
}
