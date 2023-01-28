package g2001_2100.s2012_sum_of_beauty_in_the_array;

// #Medium #Array #2022_05_24_Time_10_ms_(44.69%)_Space_98.1_MB_(18.43%)

public class Solution {
    public int sumOfBeauties(int[] nums) {
        int[] maxArr = new int[nums.length];
        maxArr[0] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            maxArr[i] = Math.max(maxArr[i - 1], nums[i]);
        }
        int[] minArr = new int[nums.length];
        minArr[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            minArr[i] = Math.min(minArr[i + 1], nums[i]);
        }

        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > maxArr[i - 1] && nums[i] < minArr[i + 1]) {
                sum += 2;
            } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            }
        }

        return sum;
    }
}
