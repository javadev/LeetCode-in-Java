package g1401_1500.s1403_minimum_subsequence_in_non_increasing_order;

// #Easy #Array #Sorting #Greedy #2022_03_25_Time_13_ms_(6.30%)_Space_42.2_MB_(90.93%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list =
                Arrays.stream(nums)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.toCollection(() -> new ArrayList<>(nums.length)));
        int sum = list.stream().mapToInt(num -> num).sum();
        int minSum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (minSum > (sum - minSum)) {
                return result;
            }
            minSum += list.get(i);
            result.add(list.get(i));
        }
        return result;
    }
}
