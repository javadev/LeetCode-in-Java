package g1601_1700.s1622_fancy_sequence;

// #Hard #Math #Design #Segment_Tree #2022_04_18_Time_40_ms_(96.55%)_Space_74.7_MB_(100.00%)

import java.util.Arrays;

public class Fancy {
    private static final int MOD = 1000000007;
    private int[] values = new int[8];
    private long add = 0;
    private long mult = 1;
    private long rMult = 1;
    private int size = 0;
    private int[] inverses = cache();

    public void append(int val) {
        long result = (val - add + MOD) * rMult % MOD;
        if (size >= values.length) {
            values = Arrays.copyOf(values, size + (size << 1));
        }
        values[size++] = ((int) result);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mult = mult * m % MOD;
        add = add * m % MOD;
        rMult = rMult * inverses[m] % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= size) {
            return -1;
        }
        return (int) ((mult * values[idx] + add) % MOD);
    }

    private int multiplicativeInverse(int x) {
        long y = 1;
        long m = (long) Fancy.MOD - 2;
        long p = x;
        for (int i = 0; 1L << i < m; i++, p = p * p % Fancy.MOD) {
            if ((m >> i & 1) == 1) {
                y = y * p % Fancy.MOD;
            }
        }
        return (int) y;
    }

    private int[] cache() {
        inverses = new int[101];
        inverses[0] = 0;
        inverses[1] = 1;
        for (int i = 2; i < inverses.length; i++) {
            inverses[i] = multiplicativeInverse(i);
        }
        return inverses;
    }
}
