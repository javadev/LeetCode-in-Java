package g2401_2500.s2407_longest_increasing_subsequence_ii;

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Queue #Segment_Tree #Binary_Indexed_Tree
// #Monotonic_Queue #2022_10_24_Time_24_ms_(99.21%)_Space_50.3_MB_(98.08%)

public class Solution {
    private static class SegTree {
        private int[] arr;
        private int n;

        public SegTree(int n) {
            this.n = n;
            arr = new int[2 * n];
        }

        public int query(int l, int r) {
            l += n;
            r += n;
            int ans = 0;
            while (l < r) {
                if ((l & 1) == 1) {
                    ans = Math.max(ans, arr[l]);
                    l += 1;
                }
                if ((r & 1) == 1) {
                    r -= 1;
                    ans = Math.max(ans, arr[r]);
                }
                l = l >> 1;
                r = r >> 1;
            }
            return ans;
        }

        public void update(int i, int val) {
            i += n;
            arr[i] = val;
            while (i > 0) {
                i = i >> 1;
                arr[i] = Math.max(arr[2 * i], arr[2 * i + 1]);
            }
        }
    }

    public int lengthOfLIS(int[] nums, int k) {
        int max = 0;
        for (int n : nums) {
            max = Math.max(max, n);
        }
        SegTree seg = new SegTree(max);
        int ans = 0;
        for (int n : nums) {
            n -= 1;
            int temp = seg.query(Math.max(0, n - k), n) + 1;
            ans = Math.max(ans, temp);
            seg.update(n, temp);
        }
        return ans;
    }
}
