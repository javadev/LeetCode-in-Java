package g0901_1000.s0952_largest_component_size_by_common_factor;

// #Hard #Array #Math #Union_Find #2022_02_18_Time_225_ms_(76.99%)_Space_64.2_MB_(65.49%)

public class Solution {
    public int largestComponentSize(int[] nums) {
        int max = 0;
        for (int a : nums) {
            max = Math.max(max, a);
        }
        int[] roots = new int[max + 1];
        int[] sizes = new int[max + 1];
        for (int idx = 1; idx <= max; idx++) {
            roots[idx] = idx;
        }
        for (int a : nums) {
            if (a == 1) {
                sizes[a] = 1;
                continue;
            }
            int sqrt = (int) Math.sqrt(a);
            int thisRoot = getRoot(roots, a);
            sizes[thisRoot]++;
            for (int factor = 1; factor <= sqrt; factor++) {
                if (a % factor == 0) {
                    int otherFactor = a / factor;
                    int otherFactorRoot = getRoot(roots, otherFactor);
                    if (factor != 1) {
                        union(roots, thisRoot, factor, sizes);
                    }
                    union(roots, thisRoot, otherFactorRoot, sizes);
                }
            }
        }
        int maxConnection = 0;
        for (int size : sizes) {
            maxConnection = Math.max(maxConnection, size);
        }
        return maxConnection;
    }

    public void union(int[] roots, int a, int b, int[] sizes) {
        int rootA = getRoot(roots, a);
        int rootB = getRoot(roots, b);
        if (rootA != rootB) {
            sizes[rootA] += sizes[rootB];
            roots[rootB] = rootA;
        }
    }

    public int getRoot(int[] roots, int a) {
        if (roots[a] == a) {
            return a;
        }
        roots[a] = getRoot(roots, roots[a]);
        return roots[a];
    }
}
