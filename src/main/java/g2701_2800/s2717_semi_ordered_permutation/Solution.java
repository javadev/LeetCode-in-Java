package g2701_2800.s2717_semi_ordered_permutation;

// #Easy #Array #Simulation #2023_09_15_Time_3_ms_(100.00%)_Space_43.3_MB_(98.28%)

public class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int a = 1;
        int b = nums.length;
        int idxA = 0;
        int idxB = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a) {
                idxA = i;
            }
            if (nums[i] == b) {
                idxB = i;
            }
        }
        b = b - idxB - 1;
        if (idxB < idxA) {
            return idxA + b - 1;
        } else {
            return idxA + b;
        }
    }
}
