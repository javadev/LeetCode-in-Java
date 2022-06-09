package g2101_2200.s2179_count_good_triplets_in_an_array;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_06_09_Time_16_ms_(92.94%)_Space_78.1_MB_(77.65%)

public class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] idx = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            idx[nums2[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = idx[nums1[i]];
        }
        Tree tree = new Tree(n);
        long res = 0L;
        for (int i = 0; i < n; i++) {
            int smaller = tree.query(arr[i]);
            int bigger = n - (arr[i] + 1) - (i - smaller);
            res += (long) smaller * bigger;
            tree.update(arr[i] + 1, 1);
        }
        return res;
    }

    private static class Tree {
        int[] array;
        int n;

        public Tree(int n) {
            this.n = n;
            array = new int[n + 1];
        }

        int lowbit(int x) {
            return x & (-x);
        }

        void update(int i, int delta) {
            while (i <= n) {
                array[i] += delta;
                i += lowbit(i);
            }
        }

        int query(int k) {
            int ans = 0;
            while (k > 0) {
                ans += array[k];
                k -= lowbit(k);
            }
            return ans;
        }
    }
}
