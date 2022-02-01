package g0701_0800.s0798_smallest_rotation_with_highest_score;

// #Hard #Array #Prefix_Sum

public class Solution {
    // a[i] will be in the range [0, a.length].
    // At which positions will we lose points? The answer is k = i - a[i] + 1.
    // We need to accumulate points we have lost from previous rotations using prefix sum except one
    // we did not lose.
    public int bestRotation(int[] a) {
        int n = a.length;
        int res = 0;
        int[] change = new int[n];
        for (int i = 0; i < n; i++) {
            change[(i - a[i] + 1 + n) % n]--;
        }
        for (int i = 1; i < n; i++) {
            change[i] += change[i - 1] + 1;
            res = change[i] > change[res] ? i : res;
        }
        return res;
    }
}
