package g0001_0100.s0046_permutations;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Backtracking
// #Algorithm_I_Day_11_Recursion_Backtracking #Level_2_Day_20_Brute_Force/Backtracking
// #Udemy_Backtracking/Recursion #Big_O_Time_O(n*n!)_Space_O(n+n!)
// #2023_08_11_Time_1_ms_(95.07%)_Space_43.7_MB_(87.98%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> finalResult = new ArrayList<>();
        permuteRecur(nums, finalResult, new ArrayList<>(), new boolean[nums.length]);
        return finalResult;
    }

    private void permuteRecur(
            int[] nums, List<List<Integer>> finalResult, List<Integer> currResult, boolean[] used) {
        if (currResult.size() == nums.length) {
            finalResult.add(new ArrayList<>(currResult));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            currResult.add(nums[i]);
            used[i] = true;
            permuteRecur(nums, finalResult, currResult, used);
            used[i] = false;
            currResult.remove(currResult.size() - 1);
        }
    }
}
