package g1701_1800.s1720_decode_xored_array;

// #Easy #Array #Bit_Manipulation #2022_04_24_Time_1_ms_(100.00%)_Space_57.3_MB_(6.33%)

public class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}
