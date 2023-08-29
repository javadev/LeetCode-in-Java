package g0901_1000.s0985_sum_of_even_numbers_after_queries;

// #Medium #Array #Simulation #2022_03_31_Time_6_ms_(71.11%)_Space_74.1_MB_(22.54%)

public class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        int res = 0;
        for (int num : nums) {
            res += (num & 1) == 0 ? num : 0;
        }
        int k = 0;
        for (int[] query : queries) {
            res -= (nums[query[1]] & 1) == 0 ? nums[query[1]] : 0;
            nums[query[1]] += query[0];
            if ((nums[query[1]] & 1) == 0) {
                res += nums[query[1]];
            }
            result[k++] = res;
        }
        return result;
    }
}
