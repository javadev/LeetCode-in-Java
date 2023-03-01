package g2401_2500.s2425_bitwise_xor_of_all_pairings;

// #Medium #Array #Bit_Manipulation #Brainteaser
// #2022_11_19_Time_5_ms_(38.15%)_Space_86.3_MB_(17.15%)

public class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor = 0;
        if (nums2.length % 2 == 1) {
            for (int x : nums1) {
                xor ^= x;
            }
        }
        if (nums1.length % 2 == 1) {
            for (int x : nums2) {
                xor ^= x;
            }
        }
        return xor;
    }
}
