package g3801_3900.s3859_count_subarrays_with_k_distinct_integers;

// #Hard #Array #Hash_Table #Counting #Sliding_Window #Senior_Staff #Weekly_Contest_491
// #2026_07_27_Time_36_ms_(88.89%)_Space_77.36_MB_(87.65%)

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public long countSubarrays(int[] nums, int k, int m) {
        int left = 0;
        int p = 0;
        long subArr = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int valid = 0;

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);

            if (map.get(val) == m) {
                valid++;
            }

            WindowState state = shrinkDistinct(nums, left, p, k, m, map, valid);
            left = state.left();
            p = state.p();
            valid = state.valid();

            WindowState duplicateState = trimDuplicates(nums, left, p, m, map);
            left = duplicateState.left();
            p = duplicateState.p();

            if (map.size() == k && valid == k) {
                subArr += 1 + p;
            }
        }

        return subArr;
    }

    private WindowState shrinkDistinct(
            int[] nums, int left, int p, int k, int m, Map<Integer, Integer> map, int valid) {

        while (map.size() > k) {
            int lv = nums[left];

            if (map.get(lv) == m) {
                valid--;
            }

            map.put(lv, map.get(lv) - 1);

            if (map.get(lv) == 0) {
                map.remove(lv);
            }

            left++;
            p = 0;
        }

        return new WindowState(left, p, valid);
    }

    private WindowState trimDuplicates(
            int[] nums, int left, int p, int m, Map<Integer, Integer> map) {

        while (!map.isEmpty() && map.get(nums[left]) > m) {
            int lv = nums[left];
            map.put(lv, map.get(lv) - 1);
            left++;
            p++;
        }

        return new WindowState(left, p, 0);
    }

    private record WindowState(int left, int p, int valid) {

    }
}
