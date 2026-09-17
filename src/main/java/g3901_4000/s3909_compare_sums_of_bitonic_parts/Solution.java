package g3901_4000.s3909_compare_sums_of_bitonic_parts;

// #Medium #Array #Senior #Biweekly_Contest_181
// #2026_09_17_Time_1_ms_(100.00%)_Space_104.27_MB_(31.52%)

public class Solution {
    public int compareBitonicSums(int[] nums) {
        long asc = 0;
        long desc = 0;
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            asc += nums[i];
            if (nums[i] > nums[i + 1]) {
                break;
            }
        }
        for (; i < nums.length; i++) {
            desc += nums[i];
        }
        if (asc == desc) {
            return -1;
        }
        return asc > desc ? 0 : 1;
    }
}
