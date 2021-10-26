package s0001.two.sum;

import java.util.Arrays;

@SuppressWarnings("java:S1598")
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return new int[0];
        }
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        int[] nums1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums1);
        while (left < right) {
            if (nums1[left] + nums1[right] == target) {
                break;
            } else if (nums1[left] + nums1[right] > target) {
                right--;
            } else if (nums1[left] + nums1[right] < target) {
                left++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums1[left] == nums[i]) {
                result[0] = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums1[right] == nums[j]) {
                result[1] = j;
                break;
            }
        }

        int tmp = result[0];
        result[0] = Math.min(result[0], result[1]);
        result[1] = Math.max(tmp, result[1]);
        return result;
    }
}
