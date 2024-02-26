package g0001_0100.s0018_4sum;

// #Medium #Array #Sorting #Two_Pointers #2024_02_11_Time_3_ms_(99.69%)_Space_44.1_MB_(49.13%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[j] + nums[j + 1] + nums[j + 2] > target - nums[i]) {
                    break;
                }
                if ((long) nums[j] + nums[n - 2] + nums[n - 1] < target - nums[i]) {
                    continue;
                }
                int tempTarget = target - (nums[i] + nums[j]);
                int low = j + 1;
                int high = n - 1;
                while (low < high) {
                    int curSum = nums[low] + nums[high];
                    if (curSum == tempTarget) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[low]);
                        tempList.add(nums[high]);
                        result.add(tempList);
                        low++;
                        high--;
                        while (low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high + 1]) {
                            high--;
                        }
                    } else if (curSum < tempTarget) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }
}
