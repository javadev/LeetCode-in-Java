package g3001_3100.s3011_find_if_array_can_be_sorted;

// #Medium #Array #Sorting #Bit_Manipulation #2024_02_27_Time_1_ms_(100.00%)_Space_44.4_MB_(59.99%)

public class Solution {
    public boolean canSortArray(int[] nums) {
        int lastGroupMax = Integer.MIN_VALUE;
        int max = nums[0];
        int lastBit = Integer.bitCount(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int bit = Integer.bitCount(nums[i]);
            if (bit == lastBit) {
                max = Math.max(max, nums[i]);
            } else {
                lastGroupMax = max;
                max = nums[i];
                lastBit = bit;
            }
            if (nums[i] < lastGroupMax) {
                return false;
            }
        }
        return true;
    }
}
