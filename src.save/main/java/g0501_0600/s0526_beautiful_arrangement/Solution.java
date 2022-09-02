package g0501_0600.s0526_beautiful_arrangement;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_07_28_Time_3_ms_(98.66%)_Space_41.5_MB_(24.19%)

public class Solution {
    public int countArrangement(int n) {
        return backtrack(n, n, new Integer[1 << (n + 1)], 0);
    }

    private int backtrack(int n, int index, Integer[] cache, int cacheindex) {
        if (index == 0) {
            return 1;
        }
        int result = 0;
        if (cache[cacheindex] != null) {
            return cache[cacheindex];
        }
        for (int i = n; i > 0; i--) {
            if ((cacheindex & (1 << i)) == 0 && (i % (index) == 0 || (index) % i == 0)) {
                result += backtrack(n, index - 1, cache, cacheindex | 1 << i);
            }
        }
        cache[cacheindex] = result;
        return result;
    }
}
