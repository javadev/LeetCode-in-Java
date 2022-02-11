package g0901_1000.s0985_sum_of_even_numbers_after_queries;

// #Medium #Array #Simulation

public class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int result[] = new int[queries.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += (nums[i] & 1) == 0 ? nums[i] : 0;
        }
        int k = 0;
        for (int query[] : queries) {
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
