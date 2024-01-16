package g2201_2300.s2216_minimum_deletions_to_make_array_beautiful;

// #Medium #Array #Greedy #Stack #2022_06_12_Time_7_ms_(39.24%)_Space_99.1_MB_(38.54%)

public class Solution {
    public int minDeletion(int[] nums) {
        int offset = 0;
        int res = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length - 1 && nums[j + 1] == nums[j] && (j - offset) % 2 == 0) {
                offset++;
                res++;
                j++;
            }
            i = j + 2;
        }
        if ((nums.length - offset) % 2 != 0) {
            res++;
        }
        return res;
    }
}
