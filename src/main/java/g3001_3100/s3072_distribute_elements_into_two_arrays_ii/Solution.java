package g3001_3100.s3072_distribute_elements_into_two_arrays_ii;

// #Hard #Array #Simulation #Segment_Tree #Binary_Indexed_Tree
// #2024_04_15_Time_48_ms_(99.90%)_Space_65_MB_(74.73%)

import java.util.Arrays;

public class Solution {
    private static class BIT {
        private final int[] tree;

        public BIT(int size) {
            tree = new int[size + 1];
        }

        public void update(int ind) {
            while (ind < tree.length) {
                tree[ind]++;
                ind += lsb(ind);
            }
        }

        public int rsq(int ind) {
            int sum = 0;
            while (ind > 0) {
                sum += tree[ind];
                ind -= lsb(ind);
            }
            return sum;
        }

        private int lsb(int n) {
            return n & (-n);
        }
    }

    public int[] resultArray(int[] source) {
        int[] nums = shrink(source);
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = source[0];
        arr2[0] = source[1];
        int p1 = 0;
        int p2 = 0;
        BIT bit1 = new BIT(nums.length);
        bit1.update(nums[0]);
        BIT bit2 = new BIT(nums.length);
        bit2.update(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int g1 = p1 + 1 - bit1.rsq(nums[i]);
            int g2 = p2 + 1 - bit2.rsq(nums[i]);
            if (g1 < g2 || p1 > p2) {
                p2++;
                arr2[p2] = source[i];
                bit2.update(nums[i]);
            } else {
                p1++;
                arr1[p1] = source[i];
                bit1.update(nums[i]);
            }
        }
        for (int i = p1 + 1; i < arr1.length; i++) {
            arr1[i] = arr2[i - p1 - 1];
        }
        return arr1;
    }

    private int[] shrink(int[] nums) {
        long[] b = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = (long) nums[i] << 32 | i;
        }
        Arrays.sort(b);
        int[] result = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (b[i] ^ b[i - 1]) >> 32 != 0) {
                p++;
            }
            result[(int) b[i]] = p;
        }
        return result;
    }
}
