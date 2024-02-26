package g2901_3000.s2997_minimum_number_of_operations_to_make_array_xor_equal_to_k;

// #Medium #Array #Bit_Manipulation #2024_01_17_Time_1_ms_(100.00%)_Space_58.7_MB_(15.31%)

public class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        while (xor > 0 || k > 0) {
            if (xor % 2 != k % 2) {
                count++;
            }
            xor /= 2;
            k /= 2;
        }
        return count;
    }
}
