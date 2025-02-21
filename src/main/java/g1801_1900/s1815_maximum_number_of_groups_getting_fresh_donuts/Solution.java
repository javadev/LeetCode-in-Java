package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2025_02_21_Time_2_ms_(100.00%)_Space_41.56_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxHappyGroups(int batchSize, int[] groups) {
        if (batchSize == 1) {
            return groups.length;
        }
        int[] withSize = new int[batchSize];
        for (int size : groups) {
            withSize[size % batchSize]++;
        }
        int fromZero = withSize[0];
        withSize[0] = 0;
        int fromEnds = 0;
        for (int l = 1, r = batchSize - 1; l < r; l++, r--) {
            int usable = Math.min(withSize[l], withSize[r]);
            fromEnds += usable;
            withSize[l] -= usable;
            withSize[r] -= usable;
        }
        int fromMid = 0;
        if (batchSize % 2 == 0) {
            fromMid = withSize[batchSize / 2] / 2;
            withSize[batchSize / 2] -= fromMid * 2;
        }
        return get(pruneEnd(withSize), batchSize, 0, new HashMap<>())
                + fromZero
                + fromEnds
                + fromMid;
    }

    private int get(int[] ar, int batchSize, int rem, Map<Long, Integer> cache) {
        long hash = 0;
        for (int e : ar) {
            hash = hash * 69L + e;
        }
        Integer fromCache = cache.get(hash);
        if (fromCache != null) {
            return fromCache;
        }
        if (zeroed(ar)) {
            cache.put(hash, 0);
            return 0;
        }
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                continue;
            }
            ar[i]--;
            int from = get(ar, batchSize, (rem + i) % batchSize, cache);
            if (from > max) {
                max = from;
            }
            ar[i]++;
        }
        int score = max + (rem == 0 ? 1 : 0);
        cache.put(hash, score);
        return score;
    }

    private int[] pruneEnd(int[] in) {
        int endingZeros = 0;
        for (int i = in.length - 1; i >= 0; i--) {
            if (in[i] != 0) {
                break;
            }
            endingZeros++;
        }
        int[] out = new int[in.length - endingZeros];
        for (int i = 0; i < out.length; i++) {
            out[i] = in[i];
        }
        return out;
    }

    private boolean zeroed(int[] ar) {
        for (int e : ar) {
            if (e != 0) {
                return false;
            }
        }
        return true;
    }
}
