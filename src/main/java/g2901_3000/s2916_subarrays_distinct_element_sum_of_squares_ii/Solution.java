package g2901_3000.s2916_subarrays_distinct_element_sum_of_squares_ii;

// #Hard #Array #Dynamic_Programming #Segment_Tree #Binary_Indexed_Tree
// #2023_12_28_Time_77_ms_(83.65%)_Space_56.5_MB_(83.65%)

public class Solution {
    private static final int MOD = (int) (1e9) + 7;
    private int n;
    private long[] tree1;
    private long[] tree2;

    public int sumCounts(int[] nums) {
        n = nums.length;
        tree1 = new long[n + 1];
        tree2 = new long[n + 1];
        int max = 0;
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        int[] last = new int[max + 1];
        long ans = 0;
        long cur = 0;
        for (int i = 1; i <= n; i++) {
            int x = nums[i - 1];
            int j = last[x];
            cur += 2 * (query(i) - query(j)) + (i - j);
            ans += cur;
            update(j + 1, 1);
            update(i + 1, -1);
            last[x] = i;
        }
        return (int) (ans % MOD);
    }

    int lowbit(int index) {
        return index & (-index);
    }

    void update(int index, int x) {
        int v = index * x;
        while (index <= n) {
            tree1[index] += x;
            tree2[index] += v;
            index += lowbit(index);
        }
    }

    long query(int index) {
        long res = 0;
        int p = index + 1;
        while (index > 0) {
            res += p * tree1[index] - tree2[index];
            index -= lowbit(index);
        }
        return res;
    }
}
