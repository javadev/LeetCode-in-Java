package g0001_0100.s0018_4sum_medium_array_sorting_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S135")
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0) {
            return list;
        }
        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            for (int d = n - 1; d > a + 2; d--) {
                if (d < n - 1 && nums[d] == nums[d + 1]) {
                    continue;
                }
                int b = a + 1;
                int c = d - 1;
                int min = nums[a] + nums[d] + nums[b] + nums[b + 1];
                if (min > target) {
                    continue;
                }
                int max = nums[a] + nums[d] + nums[c] + nums[c - 1];
                if (max < target) {
                    break;
                }
                while (c > b) {
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum > target) {
                        c--;
                    } else if (sum < target) {
                        b++;
                    } else {
                        list.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        while (c > b && nums[b] == nums[b + 1]) {
                            b++;
                        }
                        while (c > b && nums[c] == nums[c - 1]) {
                            c--;
                        }
                        b++;
                        c--;
                    }
                }
            }
        }
        return list;
    }
}
