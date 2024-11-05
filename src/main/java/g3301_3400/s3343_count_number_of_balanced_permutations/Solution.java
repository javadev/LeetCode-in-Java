package g3301_3400.s3343_count_number_of_balanced_permutations;

// #Hard #2024_11_04_Time_182_ms_(100.00%)_Space_45.6_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final long M = 1000000007;
    private int[] freq;

    public int countBalancedPermutations(String num) {
        int[] freq = new int[10];
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int v = num.charAt(i) - '0';
            freq[v]++;
            sum += v;
        }
        if (sum % 2 == 1) {
            return 0;
        }
        sum /= 2;
        this.freq = freq;
        int evenCount = num.length() / 2;
        int oddCount = num.length() - evenCount;
        return (int) countAll(9, evenCount, oddCount, sum, sum);
    }

    private final Map<Long, Long> cache = new HashMap<>();

    private long countAll(
            int idx, int evenLeftCount, int oddLeftCount, int evenLeftSum, int oddLeftSum) {
        if (evenLeftCount < 0 || oddLeftCount < 0 || evenLeftSum < 0 || oddLeftSum < 0) {
            return 0;
        }
        if (idx == -1) {
            if (evenLeftCount == 0 && oddLeftCount == 0) {
                return 1;
            }
            return 0;
        }
        long key = (((long) evenLeftCount) << 48) + (((long) evenLeftSum) << 32) + idx;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        long total = 0;
        for (int i = 0; i <= freq[idx]; i++) {
            int j = freq[idx] - i;
            long c =
                    countAll(
                            idx - 1,
                            evenLeftCount - i,
                            oddLeftCount - j,
                            evenLeftSum - i * idx,
                            oddLeftSum - j * idx);
            if (c == 0) {
                continue;
            }
            c = (c * choose(evenLeftCount, i)) % M;
            c = (c * choose(oddLeftCount, j)) % M;
            total = (total + c) % M;
        }
        cache.put(key, total);
        return total;
    }

    private static final List<long[]> LONGS = new ArrayList<>();

    static {
        LONGS.add(new long[] {1});
    }

    private static long choose(int a, int b) {
        while (a >= LONGS.size()) {
            long[] prev = LONGS.get(LONGS.size() - 1);
            long[] next = new long[prev.length + 1];
            for (int i = 0; i < prev.length; i++) {
                next[i] = (next[i] + prev[i]) % M;
                next[i + 1] = prev[i];
            }
            LONGS.add(next);
        }
        if (a - b < b) {
            b = a - b;
        }
        if (b < 0) {
            return 0;
        }
        return LONGS.get(a)[b];
    }
}
