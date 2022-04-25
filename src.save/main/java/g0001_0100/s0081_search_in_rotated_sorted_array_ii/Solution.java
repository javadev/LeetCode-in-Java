package g0001_0100.s0081_search_in_rotated_sorted_array_ii;

// #Medium #Array #Binary_Search #Binary_Search_II_Day_12
// #2022_02_21_Time_1_ms_(73.34%)_Space_43.5_MB_(25.95%)

public class Solution {
    public boolean search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    private boolean binary(int[] a, int i, int j, int t) {
        if (i > j) {
            return false;
        }
        int mid = (i + j) / 2;
        if (a[mid] == t) {
            return true;
        }
        boolean c1 = binary(a, i, mid - 1, t);
        boolean c2 = binary(a, mid + 1, j, t);
        return c1 || c2;
    }
}
