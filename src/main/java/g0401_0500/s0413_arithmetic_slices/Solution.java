package g0401_0500.s0413_arithmetic_slices;

// #Medium #Array #Dynamic_Programming

public class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int sum = 0;
        int curr = 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] == a[i - 1] - a[i - 2]) {
                curr++;
                sum += curr;
            } else {
                curr = 0;
            }
        }
        return sum;
    }
}
