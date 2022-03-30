package g0001_0100.s0078_subsets;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Bit_Manipulation #Backtracking
// #2022_02_19_Time_1_ms_(79.43%)_Space_43.6_MB_(15.82%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, new ArrayList<>(), res, 0);
        return res;
    }

    private void solve(int[] nums, List<Integer> temp, List<List<Integer>> res, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            solve(nums, temp, res, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
