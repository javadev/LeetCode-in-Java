package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i;

// #Hard #2024_12_22_Time_1115_ms_(100.00%)_Space_45.2_MB_(100.00%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final int MOD = 1000000007;

    public int subsequencesWithMiddleMode(int[] a) {
        int n = a.length;
        // Create a dictionary to store indices of each number
        Map<Integer, List<Integer>> dict = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dict.computeIfAbsent(a[i], k -> new ArrayList<>()).add(i);
        }
        long ans = 0L;
        // Iterate over each unique number and its indices
        for (Map.Entry<Integer, List<Integer>> entry : dict.entrySet()) {
            List<Integer> b = entry.getValue();
            int m = b.size();
            for (int k = 0; k < m; k++) {
                int i = b.get(k);
                int r = m - 1 - k;
                int u = i - k;
                int v = (n - 1 - i) - r;
                // Case 2: Frequency of occurrence is 2 times
                ans = (ans + convert(k, 1) * convert(u, 1) % MOD * convert(v, 2) % MOD) % MOD;
                ans = (ans + convert(r, 1) * convert(u, 2) % MOD * convert(v, 1) % MOD) % MOD;
                // Case 3: Frequency of occurrence is 3 times
                ans = (ans + convert(k, 2) * convert(v, 2) % MOD) % MOD;
                ans = (ans + convert(r, 2) * convert(u, 2) % MOD) % MOD;
                ans =
                        (ans
                                        + convert(k, 1)
                                                * convert(r, 1)
                                                % MOD
                                                * convert(u, 1)
                                                % MOD
                                                * convert(v, 1)
                                                % MOD)
                                % MOD;

                // Case 4: Frequency of occurrence is 4 times
                ans = (ans + convert(k, 2) * convert(r, 1) % MOD * convert(v, 1) % MOD) % MOD;
                ans = (ans + convert(k, 1) * convert(r, 2) % MOD * convert(u, 1) % MOD) % MOD;

                // Case 5: Frequency of occurrence is 5 times
                ans = (ans + convert(k, 2) * convert(r, 2) % MOD) % MOD;
            }
        }
        long dif = 0;
        // Principle of inclusion-exclusion
        for (Map.Entry<Integer, List<Integer>> midEntry : dict.entrySet()) {
            List<Integer> b = midEntry.getValue();
            int m = b.size();
            for (Map.Entry<Integer, List<Integer>> tmpEntry : dict.entrySet()) {
                if (!midEntry.getKey().equals(tmpEntry.getKey())) {
                    List<Integer> c = tmpEntry.getValue();
                    int size = c.size();
                    for (int k = 0, j = 0; k < m; k++) {
                        int i = b.get(k);
                        int r = m - 1 - k;
                        int u = i - k;
                        int v = (n - 1 - i) - r;
                        while (j < size && c.get(j) < i) {
                            j++;
                        }
                        int x = j;
                        int y = size - x;
                        dif =
                                (dif
                                                + convert(k, 1)
                                                        * convert(x, 1)
                                                        % MOD
                                                        * convert(y, 1)
                                                        % MOD
                                                        * convert(v - y, 1)
                                                        % MOD)
                                        % MOD;
                        dif =
                                (dif
                                                + convert(k, 1)
                                                        * convert(y, 2)
                                                        % MOD
                                                        * convert(u - x, 1)
                                                        % MOD)
                                        % MOD;
                        dif =
                                (dif + convert(k, 1) * convert(x, 1) % MOD * convert(y, 2) % MOD)
                                        % MOD;

                        dif =
                                (dif
                                                + convert(r, 1)
                                                        * convert(x, 1)
                                                        % MOD
                                                        * convert(y, 1)
                                                        % MOD
                                                        * convert(u - x, 1)
                                                        % MOD)
                                        % MOD;
                        dif =
                                (dif
                                                + convert(r, 1)
                                                        * convert(x, 2)
                                                        % MOD
                                                        * convert(v - y, 1)
                                                        % MOD)
                                        % MOD;
                        dif =
                                (dif + convert(r, 1) * convert(x, 2) % MOD * convert(y, 1) % MOD)
                                        % MOD;
                    }
                }
            }
        }
        return (int) ((ans - dif + MOD) % MOD);
    }

    private long convert(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res % MOD;
    }
}
