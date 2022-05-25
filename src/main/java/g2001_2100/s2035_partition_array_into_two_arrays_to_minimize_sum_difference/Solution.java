package g2001_2100.s2035_partition_array_into_two_arrays_to_minimize_sum_difference;

// #Hard #Array #Dynamic_Programming #Binary_Search #Two_Pointers #Bit_Manipulation #Ordered_Set
// #Bitmask #2022_05_25_Time_1336_ms_(39.36%)_Space_117.6_MB_(50.53%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minimumDifference(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int n = nums.length / 2;
        int sum = 0;
        List<List<Integer>> arr1 = new ArrayList<>();
        List<List<Integer>> arr2 = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arr1.add(new ArrayList<>());
            arr2.add(new ArrayList<>());
            if (i < n) {
                sum += nums[i];
                sum += nums[i + n];
            }
        }
        for (int state = 0; state < (1 << n); state++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if ((state & (1 << i)) == 0) {
                    continue;
                }
                int a1 = nums[i];
                int a2 = nums[i + n];
                sum1 += a1;
                sum2 += a2;
            }
            int numOfEleInSet = Integer.bitCount(state);
            arr1.get(numOfEleInSet).add(sum1);
            arr2.get(numOfEleInSet).add(sum2);
        }
        for (int i = 0; i <= n; i++) {
            Collections.sort(arr2.get(i));
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            List<Integer> sums1 = arr1.get(i);
            List<Integer> sums2 = arr2.get(n - i);
            for (int s1 : sums1) {
                int idx = Collections.binarySearch(sums2, sum / 2 - s1);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                if (idx < sums1.size()) {
                    min =
                            Math.min(
                                    min,
                                    Math.abs((sum - s1 - sums2.get(idx)) - (sums2.get(idx) + s1)));
                }
                if (idx - 1 >= 0) {
                    min =
                            Math.min(
                                    min,
                                    Math.abs(
                                            (sum - s1 - sums2.get(idx - 1))
                                                    - (sums2.get(idx - 1) + s1)));
                }
            }
        }
        return min;
    }
}
