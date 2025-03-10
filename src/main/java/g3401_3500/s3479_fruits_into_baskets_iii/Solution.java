package g3401_3500.s3479_fruits_into_baskets_iii;

// #Medium #Array #Binary_Search #Ordered_Set #Segment_Tree
// #2025_03_10_Time_38_ms_(97.76%)_Space_67.52_MB_(38.48%)

public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        int size = 1;
        while (size < n) {
            size <<= 1;
        }
        int[] seg = new int[2 * size];
        for (int i = 0; i < n; i++) {
            seg[size + i] = baskets[i];
        }
        for (int i = n; i < size; i++) {
            seg[size + i] = 0;
        }
        for (int i = size - 1; i > 0; i--) {
            seg[i] = Math.max(seg[i << 1], seg[i << 1 | 1]);
        }
        int ans = 0;
        for (int f : fruits) {
            if (seg[1] < f) {
                ans++;
                continue;
            }
            int idx = 1;
            while (idx < size) {
                if (seg[idx << 1] >= f) {
                    idx = idx << 1;
                } else {
                    idx = idx << 1 | 1;
                }
            }
            update(seg, idx - size, 0, size);
        }
        return ans;
    }

    private void update(int[] seg, int pos, int val, int size) {
        int i = pos + size;
        seg[i] = val;
        for (i /= 2; i > 0; i /= 2) {
            seg[i] = Math.max(seg[i << 1], seg[i << 1 | 1]);
        }
    }
}
