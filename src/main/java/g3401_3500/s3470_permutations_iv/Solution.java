package g3401_3500.s3470_permutations_iv;

// #Hard #2025_03_02_Time_12_ms_(100.00%)_Space_45.94_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    // Define a large constant value to cap calculations and prevent overflow
    private static final long CAP = 1000000000000001L;
    // 3D DP array to store precomputed results for dynamic programming
    private static final long[][][] DP = new long[105][105][3];

    // Initialize DP array with -1 (indicating uncomputed states)
    static {
        for (long[][] longs : DP) {
            for (long[] aLong : longs) {
                Arrays.fill(aLong, -1);
            }
        }
    }

    // Recursive function to count alternating permutations
    private long rec(int o, int e, int req) {
        if (o == 0 && e == 0) {
            return 1;
        }
        if (DP[o][e][req] != -1) {
            return DP[o][e][req];
        }
        long count = 0;
        if (req == 2) {
            if (o > 0) {
                count = addCapped(count, multiplyCapped(o, rec(o - 1, e, 1)));
            }
            if (e > 0) {
                count = addCapped(count, multiplyCapped(e, rec(o, e - 1, 0)));
            }
        } else if (req == 0) {
            if (o > 0) count = multiplyCapped(o, rec(o - 1, e, 1));
        } else {
            if (e > 0) count = multiplyCapped(e, rec(o, e - 1, 0));
        }
        DP[o][e][req] = count;
        return count;
    }

    // Helper function to prevent overflow when multiplying
    private long multiplyCapped(long a, long b) {
        if (b == 0) {
            return 0;
        }
        if (a >= CAP || b >= CAP || a > CAP / b) {
            return CAP;
        }
        return a * b;
    }

    // Helper function to prevent overflow when adding
    private long addCapped(long a, long b) {
        long res = a + b;
        return Math.min(res, CAP);
    }

    public int[] permute(int n, long k) {
        // Separate odd and even numbers from 1 to n
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            if ((x & 1) == 1) {
                odds.add(x);
            } else {
                evens.add(x);
            }
        }
        // Count the number of odd and even elements
        int oCount = odds.size();
        int eCount = evens.size();
        long ansTotal = rec(oCount, eCount, 2);
        if (k > ansTotal) {
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();
        int req = 2;
        while (oCount + eCount > 0) {
            List<Integer> candidates = new ArrayList<>();
            if (req == 2) {
                int i = 0;
                int j = 0;
                while (i < odds.size() || j < evens.size()) {
                    if (j >= evens.size() || (i < odds.size() && odds.get(i) < evens.get(j))) {
                        candidates.add(odds.get(i++));
                    } else {
                        candidates.add(evens.get(j++));
                    }
                }
            } else if (req == 0) {
                candidates.addAll(odds);
            } else {
                candidates.addAll(evens);
            }
            boolean found = false;
            for (int num : candidates) {
                int candidateParity = (num % 2 == 1) ? 0 : 1;
                if (req != 2 && candidateParity != req) {
                    continue;
                }
                long ways;
                if (candidateParity == 0) {
                    ways = rec(oCount - 1, eCount, 1);
                } else {
                    ways = rec(oCount, eCount - 1, 0);
                }
                if (ways >= k) {
                    result.add(num);
                    if (candidateParity == 0) {
                        odds.remove(Integer.valueOf(num));
                        oCount--;
                        req = 1;
                    } else {
                        evens.remove(Integer.valueOf(num));
                        eCount--;
                        req = 0;
                    }
                    found = true;
                    break;
                } else {
                    k -= ways;
                }
            }
            if (!found) {
                return new int[0];
            }
        }
        // Convert result list to array and return
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
