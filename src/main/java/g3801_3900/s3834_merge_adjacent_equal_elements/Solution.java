package g3801_3900.s3834_merge_adjacent_equal_elements;

// #Medium #Array #Stack #Simulation #Senior #Weekly_Contest_488
// #2026_07_21_Time_17_ms_(97.36%)_Space_130.84_MB_(46.15%)

public class Solution {
    public java.util.List<Long> mergeAdjacent(int[] nums) {
        java.util.List<Long> ans = new java.util.ArrayList<>();
        for (long num : nums) {
            long curr = num;
            while (!ans.isEmpty() && ans.get(ans.size() - 1) == curr) {
                ans.remove(ans.size() - 1);
                curr *= 2;
            }
            ans.add(curr);
        }
        return ans;
    }
}
