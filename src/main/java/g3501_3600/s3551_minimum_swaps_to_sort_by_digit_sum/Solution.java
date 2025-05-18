package g3501_3600.s3551_minimum_swaps_to_sort_by_digit_sum;

// #Medium #2025_05_18_Time_211_ms_(99.38%)_Space_61.54_MB_(92.80%)

import java.util.Arrays;

public class Solution {
    private static class Pair {
        int sum;
        int value;
        int index;

        Pair(int s, int v, int i) {
            sum = s;
            value = v;
            index = i;
        }
    }

    public int minSwaps(int[] arr) {
        int n = arr.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            int s = 0;
            while (v > 0) {
                s += v % 10;
                v /= 10;
            }
            pairs[i] = new Pair(s, arr[i], i);
        }
        Arrays.sort(
                pairs,
                (a, b) -> {
                    if (a.sum != b.sum) {
                        return a.sum - b.sum;
                    }
                    return a.value - b.value;
                });
        int[] posMap = new int[n];
        for (int i = 0; i < n; i++) {
            posMap[i] = pairs[i].index;
        }
        boolean[] seen = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (seen[i] || posMap[i] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!seen[j]) {
                seen[j] = true;
                j = posMap[j];
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }
        return swaps;
    }
}
