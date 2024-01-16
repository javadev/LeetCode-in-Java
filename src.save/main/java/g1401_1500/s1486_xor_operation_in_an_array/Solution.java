package g1401_1500.s1486_xor_operation_in_an_array;

// #Easy #Math #Bit_Manipulation #2022_04_05_Time_0_ms_(100.00%)_Space_40.7_MB_(58.44%)

public class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
