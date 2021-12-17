package g0401_0500.s0413_arithmetic_slices;

// #Medium #Array #Dynamic_Programming

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int sum = 0;
        int curr = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                curr++;
                sum += curr;
            } else {
                curr = 0;
            }
        }
        return sum;
    }
}
