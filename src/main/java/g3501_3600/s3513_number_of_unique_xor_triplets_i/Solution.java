package g3501_3600.s3513_number_of_unique_xor_triplets_i;

// #Medium #Array #Math #Bit_Manipulation #2025_04_14_Time_1_ms_(100.00%)_Space_62.16_MB_(100.00%)

public class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        return n < 3 ? n : Integer.highestOneBit(n) << 1;
    }
}
