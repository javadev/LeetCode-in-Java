package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i;

// #Hard #2025_07_20_Time_1_ms_(100.00%)_Space_41.10_MB_(100.00%)

public class Solution {
    private static final int MX_LN = 61;
    private final long[][] slct = new long[MX_LN][MX_LN];
    private final int[] popHeight = new int[MX_LN];
    private boolean strt = false;

    private void setup() {
        if (strt) {
            return;
        }
        for (int i = 0; i < MX_LN; i++) {
            slct[i][0] = slct[i][i] = 1;
            for (int j = 1; j < i; j++) {
                slct[i][j] = slct[i - 1][j - 1] + slct[i - 1][j];
            }
        }
        popHeight[1] = 0;
        for (int v = 2; v < MX_LN; v++) {
            popHeight[v] = 1 + popHeight[Long.bitCount(v)];
        }
        strt = true;
    }

    private long countNumbers(long upperLimit, int setBits) {
        if (setBits == 0) {
            return 1;
        }
        long count = 0;
        int used = 0;
        int len = 0;
        for (long x = upperLimit; x > 0; x >>= 1) {
            len++;
        }
        for (int pos = len - 1; pos >= 0; pos--) {
            if (((upperLimit >> pos) & 1) == 1) {
                if (setBits - used <= pos) {
                    count += slct[pos][setBits - used];
                }
                used++;
                if (used > setBits) {
                    break;
                }
            }
        }
        if (Long.bitCount(upperLimit) == setBits) {
            count++;
        }
        return count;
    }

    public long popcountDepth(long tillNumber, int depthQuery) {
        setup();
        if (depthQuery == 0) {
            return tillNumber >= 1 ? 1 : 0;
        }
        long total = 0;
        for (int ones = 1; ones < MX_LN; ones++) {
            if (popHeight[ones] == depthQuery - 1) {
                total += countNumbers(tillNumber, ones);
            }
        }
        if (depthQuery == 1) {
            total -= 1;
        }
        return total;
    }
}
