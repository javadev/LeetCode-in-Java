package g2701_2800.s2709_greatest_common_divisor_traversal;

// #Hard #Array #Math #Union_Find #Number_Theory
// #2023_09_15_Time_244_ms_(64.71%)_Space_55.5_MB_(91.18%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> map = null;
    private int[] set;

    private int findParent(int u) {
        if (u == set[u]) {
            return u;
        }
        set[u] = findParent(set[u]);
        return set[u];
    }

    private void union(int a, int b) {
        int p1 = findParent(a);
        int p2 = findParent(b);
        if (p1 != p2) {
            set[b] = p1;
        }
        set[p2] = p1;
    }

    private void solve(int n, int index) {
        if (n % 2 == 0) {
            int x = map.getOrDefault(2, -1);
            if (x != -1) {
                union(x, index);
            }
            while (n % 2 == 0) {
                n /= 2;
            }
            map.put(2, index);
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i++) {
            if (n % i == 0) {
                int x = map.getOrDefault(i, -1);
                if (x != -1) {
                    union(x, index);
                }
                while (n % i == 0) {
                    n /= i;
                }
                map.put(i, index);
            }
        }
        if (n > 2) {
            int x = map.getOrDefault(n, -1);
            if (x != -1) {
                union(x, index);
            }
            map.put(n, index);
        }
    }

    public boolean canTraverseAllPairs(int[] nums) {
        set = new int[nums.length];
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            set[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            solve(nums[i], i);
        }
        int p = findParent(0);
        for (int i = 0; i < nums.length; i++) {
            if (p != findParent(i)) {
                return false;
            }
        }
        return true;
    }
}
