package g3501_3600.s3514_number_of_unique_xor_triplets_ii;

// #Medium #2025_04_13_Time_1323_ms_(100.00%)_Space_45.02_MB_(100.00%)

import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> pairs = new HashSet<>(List.of(0));
        for (int i = 0, n = nums.length; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                pairs.add(nums[i] ^ nums[j]);
            }
        }
        BitSet triplets = new BitSet();
        for (int xy : pairs) {
            for (int z : nums) {
                triplets.set(xy ^ z);
            }
        }
        return triplets.cardinality();
    }
}
