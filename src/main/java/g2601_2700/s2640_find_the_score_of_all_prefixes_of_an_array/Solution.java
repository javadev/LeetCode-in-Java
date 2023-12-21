package g2601_2700.s2640_find_the_score_of_all_prefixes_of_an_array;

// #Medium #Array #Prefix_Sum #2023_09_05_Time_3_ms_(70.00%)_Space_62.2_MB_(68.21%)

public class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max = Integer.MIN_VALUE;
        long sum = 0L;
        long[] res = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            max = Math.max(max, curr);
            sum += max + curr;
            res[i] = sum;
        }
        return res;
    }
}
