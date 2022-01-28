package g0701_0800.s0775_global_and_local_inversions;

// #Medium #Array #Math

public class Solution {
    /*
     * from the above solution, we can tell that if we can find the minimum of A[j] where j >= i + 2, then we could quickly return false, so two steps:
     * 1. remembering minimum
     * 2. scanning from right to left
     * <p>
     * Time: O(n)
     */
    public boolean isIdealPermutation(int[] a) {
        int min = a.length;
        for (int i = a.length - 1; i >= 2; i--) {
            min = Math.min(min, a[i]);
            if (a[i - 2] > min) {
                return false;
            }
        }
        return true;
    }
}
