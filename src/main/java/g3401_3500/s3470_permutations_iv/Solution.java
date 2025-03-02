package g3401_3500.s3470_permutations_iv;

// #Hard #2025_03_02_Time_12_ms_(100.00%)_Space_44.78_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S6541")
public class Solution {
    private static final long INF = 1_000_000_000_000_000_000L;

    private long helper(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= (a - i);
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
        int nodd;
        int neven;
        if (req == 1) {
            nodd = (r + 1) / 2;
            neven = r / 2;
        } else {
            neven = (r + 1) / 2;
            nodd = r / 2;
        }
        if (odd < nodd || even < neven) {
            return 0;
        }
        long oddways = helper(odd, nodd);
        long evenways = helper(even, neven);
        long total = oddways;
        if (evenways == 0 || total > INF / evenways) {
            total = INF;
        } else {
            total *= evenways;
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
            boolean taken = false;
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
                        taken = true;
                        break;
                    }
                }
            }
            if (!taken) {
                return new int[0];
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
