package g2501_2600.s2527_find_xor_beauty_of_array;

// #Medium #Array #Math #Bit_Manipulation #2023_04_19_Time_1_ms_(100.00%)_Space_59.1_MB_(62.11%)

public class Solution {
    public int xorBeauty(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            arr[0] ^= arr[i];
            i++;
        }
        return arr[0];
    }
}
