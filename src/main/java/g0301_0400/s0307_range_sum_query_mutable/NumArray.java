package g0301_0400.s0307_range_sum_query_mutable;

// #Medium #Array #Design #Segment_Tree #Binary_Indexed_Tree
// #2023_03_31_Time_92_ms_(90.27%)_Space_75.3_MB_(16.68%)

public class NumArray {
    private int[] tree;
    private int[] nums;

    public NumArray(int[] nums) {
        tree = new int[nums.length + 1];
        this.nums = nums;
        // copy the array into the tree
        System.arraycopy(nums, 0, tree, 1, nums.length);
        for (int i = 1; i < tree.length; i++) {
            int parent = i + (i & -i);
            if (parent < tree.length) {
                tree[parent] += tree[i];
            }
        }
    }

    public void update(int index, int val) {
        int currValue = nums[index];
        nums[index] = val;
        index++;
        while (index < tree.length) {
            tree[index] = tree[index] - currValue + val;
            index = index + (index & -index);
        }
    }

    private int sum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= (i & -i);
        }
        return sum;
    }

    public int sumRange(int left, int right) {
        return sum(right + 1) - sum(left);
    }
}

/*
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
