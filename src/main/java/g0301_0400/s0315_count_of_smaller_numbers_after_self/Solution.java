package g0301_0400.s0315_count_of_smaller_numbers_after_self;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_07_08_Time_36_ms_(98.63%)_Space_119_MB_(77.48%)

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int minVal = 10001;
        int maxVal = -10001;
        for (int a : nums) {
            minVal = Math.min(minVal, a);
            maxVal = Math.max(maxVal, a);
        }
        int range = maxVal - (minVal - 1) + 1;
        int offset = -(minVal - 1);
        FenwickTree bit = new FenwickTree(range);
        LinkedList<Integer> ans = new LinkedList<>();
        for (int n = nums.length, i = n - 1; i >= 0; i--) {
            bit.update(offset + nums[i], 1);
            ans.addFirst(bit.ps(offset + nums[i] - 1));
        }
        return ans;
    }

    private static class FenwickTree {
        // binary index tree, index 0 is not used
        int[] bit;
        int n;

        public FenwickTree(int n) {
            this.n = n + 1;
            this.bit = new int[this.n];
        }

        public void update(int i, int v) {
            for (; i < n; i += Integer.lowestOneBit(i)) {
                bit[i] += v;
            }
        }
        // prefix sum query
        private int ps(int j) {
            int ps = 0;
            for (; j != 0; j -= Integer.lowestOneBit(j)) {
                ps += bit[j];
            }
            return ps;
        }
    }
}
