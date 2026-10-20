package g3901_4000.s3957_maximum_sum_of_m_non_overlapping_subarrays_ii;

// #Hard #Array #Dynamic_Programming #Binary_Search #Prefix_Sum #Sliding_Window #Queue
// #Monotonic_Queue #Weekly_Contest_505 #Principal
// #2026_10_20_Time_98_ms_(93.55%)_Space_104.56_MB_(90.32%)

public class Solution {
    private long[] pre;
    private long[] val;
    private int[] cnt;
    private int[] dq;
    private int n;
    private int l;
    private int r;

    public long maximumSum(int[] nums, int m, int l, int r) {
        n = nums.length;
        this.l = l;
        this.r = r;
        pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        val = new long[n + 1];
        cnt = new int[n + 1];
        dq = new int[n + 2];

        long lo = 0;
        long hi = 20000000000L;
        long ansLambda = hi;
        solve(0);
        if (cnt[n] <= m) {
            return val[n];
        }
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            solve(mid);
            if (cnt[n] <= m) {
                ansLambda = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        solve(ansLambda);
        return val[n] + ansLambda * m;
    }

    private void solve(long lambda) {
        final long neg = Long.MIN_VALUE / 4;
        val[0] = neg;
        cnt[0] = 0;

        int head = 0;
        int tail = 0;

        for (int i = 1; i <= n; i++) {
            int j = i - l;

            if (j >= 0) {
                tail = addCandidate(j, head, tail);
            }

            head = removeExpiredCandidates(head, tail, i - r);

            long bestV = val[i - 1];
            int bestC = cnt[i - 1];

            if (tail > head) {
                int b = dq[head];
                long cand = normalizedValue(b) - pre[b] + pre[i] - lambda;
                int candC = normalizedCount(b) + 1;

                if (isBetter(cand, candC, bestV, bestC)) {
                    bestV = cand;
                    bestC = candC;
                }
            }

            val[i] = bestV;
            cnt[i] = bestC;
        }
    }

    private int addCandidate(int j, int head, int tail) {
        long key = normalizedValue(j) - pre[j];
        int candidateCount = normalizedCount(j);

        while (tail > head) {
            int t = dq[tail - 1];
            long tailKey = normalizedValue(t) - pre[t];
            int tailCount = normalizedCount(t);

            if (tailKey < key || (tailKey == key && tailCount >= candidateCount)) {
                tail--;
            } else {
                break;
            }
        }

        dq[tail++] = j;
        return tail;
    }

    private int removeExpiredCandidates(int head, int tail, int minIndex) {
        while (tail > head && dq[head] < minIndex) {
            head++;
        }
        return head;
    }

    private long normalizedValue(int index) {
        return val[index] > 0 ? val[index] : 0;
    }

    private int normalizedCount(int index) {
        return val[index] > 0 ? cnt[index] : 0;
    }

    private boolean isBetter(
            long candidateValue, int candidateCount, long bestValue, int bestCount) {
        return candidateValue > bestValue
                || (candidateValue == bestValue && candidateCount < bestCount);
    }
}
