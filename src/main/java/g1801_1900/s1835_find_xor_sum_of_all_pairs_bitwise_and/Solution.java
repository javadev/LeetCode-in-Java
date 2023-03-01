package g1801_1900.s1835_find_xor_sum_of_all_pairs_bitwise_and;

// #Hard #Array #Math #Bit_Manipulation #2022_05_07_Time_1_ms_(100.00%)_Space_57.9_MB_(83.33%)

public class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i : arr1) {
            xor1 ^= i;
        }
        for (int j : arr2) {
            xor2 ^= j;
        }
        return xor1 & xor2;
    }
}
