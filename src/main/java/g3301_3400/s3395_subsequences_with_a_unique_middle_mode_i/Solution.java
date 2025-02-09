package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i;

// #Hard #Array #Hash_Table #Math #Combinatorics
// #2025_01_06_Time_27_ms_(99.29%)_Space_45.15_MB_(97.87%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private long[] c2 = new long[1001];

    public int subsequencesWithMiddleMode(int[] nums) {
        if (c2[2] == 0) {
            c2[0] = c2[1] = 0;
            c2[2] = 1;
            for (int i = 3; i < c2.length; ++i) {
                c2[i] = i * (i - 1) / 2;
            }
        }
        int n = nums.length;
        int[] newNums = new int[n];
        Map<Integer, Integer> map = new HashMap<>(n);
        int m = 0;
        int index = 0;
        for (int x : nums) {
            Integer id = map.get(x);
            if (id == null) {
                id = m++;
                map.put(x, id);
            }
            newNums[index++] = id;
        }
        if (m == n) {
            return 0;
        }
        int[] rightCount = new int[m];
        for (int x : newNums) {
            rightCount[x]++;
        }
        int[] leftCount = new int[m];
        long ans = (long) n * (n - 1) * (n - 2) * (n - 3) * (n - 4) / 120;
        for (int left = 0; left < n - 2; left++) {
            int x = newNums[left];
            rightCount[x]--;
            if (left >= 2) {
                int right = n - (left + 1);
                int leftX = leftCount[x];
                int rightX = rightCount[x];
                ans -= c2[left - leftX] * c2[right - rightX];
                for (int y = 0; y < m; ++y) {
                    if (y == x) {
                        continue;
                    }
                    int rightY = rightCount[y];
                    int leftY = leftCount[y];
                    ans -= c2[leftY] * rightX * (right - rightX);
                    ans -= c2[rightY] * leftX * (left - leftX);
                    ans -=
                            leftY
                                    * rightY
                                    * (leftX * (right - rightX - rightY)
                                            + rightX * (left - leftX - leftY));
                }
            }
            leftCount[x]++;
        }
        return (int) (ans % MOD);
    }
}
