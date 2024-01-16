package g1701_1800.s1734_decode_xored_permutation;

// #Medium #Array #Bit_Manipulation #2022_04_29_Time_6_ms_(34.52%)_Space_140.9_MB_(66.67%)

public class Solution {
    public int[] decode(int[] encoded) {
        int[] decoded = new int[encoded.length + 1];
        for (int i = 1; i < encoded.length; i = i + 2) {
            decoded[0] = decoded[0] ^ encoded[i];
            decoded[0] = decoded[0] ^ i;
            decoded[0] = decoded[0] ^ i + 1;
        }
        decoded[0] = decoded[0] ^ decoded.length;
        for (int i = 1; i < decoded.length; i++) {
            decoded[i] = decoded[i - 1] ^ encoded[i - 1];
        }
        return decoded;
    }
}
