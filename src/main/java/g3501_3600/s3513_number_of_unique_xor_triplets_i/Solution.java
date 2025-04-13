package g3501_3600.s3513_number_of_unique_xor_triplets_i;

// #Medium #2025_04_13_Time_0_ms_(100.00%)_Space_60.83_MB_(100.00%)

public class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        return n < 3 ? n : Integer.highestOneBit(n) << 1;
    }
}
