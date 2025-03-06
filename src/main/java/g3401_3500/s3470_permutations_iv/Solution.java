package g3401_3500.s3470_permutations_iv;

// #Hard #Array #Math #Enumeration #Combinatorics
// #2025_03_06_Time_11_ms_(59.56%)_Space_45.24_MB_(58.67%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S6541")
public class Solution {
    private static final long INF = 1_000_000_000_000_000_000L;

    private long helper(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a - i;
            if (res > INF) {
                return INF;
            }
        }
        return res;
    }

    private long solve(int odd, int even, int r, int req) {
        if (r == 0) {
            return 1;
        }
        int nOdd;
        int nEven;
        if (req == 1) {
            nOdd = (r + 1) / 2;
            nEven = r / 2;
        } else {
            nEven = (r + 1) / 2;
            nOdd = r / 2;
        }
        if (odd < nOdd || even < nEven) {
            return 0;
        }
        long oddWays = helper(odd, nOdd);
        long evenWays = helper(even, nEven);
        long total = oddWays;
        if (evenWays == 0 || total > INF / evenWays) {
            total = INF;
        } else {
            total *= evenWays;
        }
        return total;
    }

    public int[] permute(int n, long k) {
        List<Integer> ans = new ArrayList<>();
        boolean first = false;
        boolean[] used = new boolean[n + 1];
        int odd = (n + 1) / 2;
        int even = n / 2;
        int last = -1;
        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                int odd2 = odd;
                int even2 = even;
                int cp = i & 1;
                int next = (cp == 1 ? 0 : 1);
                if (cp == 1) {
                    odd2--;
                } else {
                    even2--;
                }
                int r = n - 1;
                long cnt = solve(odd2, even2, r, next);
                if (k > cnt) {
                    k -= cnt;
                } else {
                    ans.add(i);
                    used[i] = true;
                    odd = odd2;
                    even = even2;
                    last = cp;
                    first = true;
                    break;
                }
            }
        }
        if (!first) {
            return new int[0];
        }
        for (int z = 1; z < n; z++) {
            for (int j = 1; j <= n; j++) {
                if (!used[j] && ((j & 1) != last)) {
                    int odd2 = odd;
                    int even2 = even;
                    int cp = j & 1;
                    if (cp == 1) {
                        odd2--;
                    } else {
                        even2--;
                    }
                    int r = n - (z + 1);
                    int next = (cp == 1 ? 0 : 1);
                    long cnt2 = solve(odd2, even2, r, next);
                    if (k > cnt2) {
                        k -= cnt2;
                    } else {
                        ans.add(j);
                        used[j] = true;
                        odd = odd2;
                        even = even2;
                        last = cp;
                        break;
                    }
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
