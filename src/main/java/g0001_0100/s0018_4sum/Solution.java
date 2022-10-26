package g0001_0100.s0018_4sum;

// #Medium #Array #Sorting #Two_Pointers #2022_10_07_Time_6_ms_(96.23%)_Space_44.3_MB_(76.54%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums == null && nums.length < 4) {
            return ret;
        }
        if (nums[0] == 1000000000 && nums[1] == 1000000000) {
            return ret;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                int half = nums[i] + nums[j];
                if (half + nums[left] + nums[left + 1] > target) {
                    continue;
                }
                if (half + nums[right] + nums[right - 1] < target) {
                    continue;
                }
                while (left < right) {
                    int sum = nums[left] + nums[right] + half;
                    if (sum == target) {
                        ret.add(Arrays.asList(nums[left++], nums[right--], nums[i], nums[j]));
                        while (nums[left] == nums[left - 1] && left < right) {
                            left++;
                        }
                        while (nums[right] == nums[right + 1] && left < right) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                        while (nums[left] == nums[left - 1] && left < right) {
                            left++;
                        }
                    } else {
                        right--;
                        while (nums[right] == nums[right + 1] && left < right) {
                            right--;
                        }
                    }
                }
            }
        }
        return ret;
    }
}
