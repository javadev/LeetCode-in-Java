package g0401_0500.s0461_hamming_distance;

// #Easy #Bit_Manipulation

public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
