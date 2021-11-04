package g0001_0100.s0081_search_in_rotated_sorted_array_ii;

public class Solution {
    public boolean search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    public boolean binary(int[] a, int i, int j, int t) {
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
