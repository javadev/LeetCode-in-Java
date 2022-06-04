package g2101_2200.s2161_partition_array_according_to_given_pivot;

// #Medium #Array #Two_Pointers #Simulation #2022_06_04_Time_7_ms_(72.76%)_Space_168.9_MB_(26.82%)

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int point = 0;
        int equal = 0;
        for (int i : nums) {
            if (i < pivot) {
                ans[point] = i;
                ++point;
            } else if (i == pivot) {
                ++equal;
            }
        }
        while (equal > 0) {
            ans[point] = pivot;
            ++point;
            --equal;
        }
        for (int i : nums) {
            if (i > pivot) {
                ans[point] = i;
                ++point;
            }
        }
        return ans;
    }
}
