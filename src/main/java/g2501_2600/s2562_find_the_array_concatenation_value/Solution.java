package g2501_2600.s2562_find_the_array_concatenation_value;

// #Easy #Array #Two_Pointers #Simulation #2023_08_21_Time_0_ms_(100.00%)_Space_42.5_MB_(97.64%)

public class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int idxLeft = 0;
        int idxRight = nums.length - 1;
        while (idxLeft < idxRight) {
            sum += getConcatenationValue(nums[idxLeft], nums[idxRight]);
            ++idxLeft;
            --idxRight;
        }
        if (idxLeft == idxRight) {
            sum += nums[idxLeft];
        }
        return sum;
    }

    private long getConcatenationValue(int leftVal, int rightVal) {
        if ((long) rightVal == 10000) {
            return (long) leftVal * 100000L + (long) rightVal;
        }
        if ((long) rightVal >= 1000) {
            return (long) leftVal * 10000L + (long) rightVal;
        }
        if ((long) rightVal >= 100) {
            return (long) leftVal * 1000L + (long) rightVal;
        }
        if ((long) rightVal >= 10) {
            return (long) leftVal * 100L + (long) rightVal;
        }
        return (long) leftVal * 10L + (long) rightVal;
    }
}
