package g1801_1900.s1863_sum_of_all_subset_xor_totals;

// #Easy #Array #Math #Bit_Manipulation #Backtracking #Combinatorics #Acceptance_78.4%
// #2022_05_10_Time_22_ms_(11.36%)_Space_52.2_MB_(6.49%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        List<List<Integer>> subsets = subsets(nums);
        for (List<Integer> subset : subsets) {
            int xor = 0;
            for (int i : subset) {
                xor ^= i;
            }
            sum += xor;
        }
        return sum;
    }

    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtracking(
            List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        result.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
