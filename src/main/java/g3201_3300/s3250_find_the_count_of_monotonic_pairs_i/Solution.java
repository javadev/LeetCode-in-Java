package g3201_3300.s3250_find_the_count_of_monotonic_pairs_i;

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Combinatorics
// #2024_08_13_Time_3_ms_(100.00%)_Space_44.7_MB_(99.34%)

public class Solution {
    public int countOfPairs(int[] nums) {
        int[] maxShift = new int[nums.length];
        maxShift[0] = nums[0];
        int currShift = 0;
        for (int i = 1; i < nums.length; i++) {
            currShift = Math.max(currShift, nums[i] - maxShift[i - 1]);
            maxShift[i] = Math.min(maxShift[i - 1], nums[i] - currShift);
            if (maxShift[i] < 0) return 0;
        }
        int[][] cases = getAllCases(nums, maxShift);
        return cases[nums.length - 1][maxShift[nums.length - 1]];
    }

    private int[][] getAllCases(int[] nums, int[] maxShift) {
        int[] currCases;
        int[][] cases = new int[nums.length][];
        cases[0] = new int[maxShift[0] + 1];
        for (int i = 0; i < cases[0].length; i++) {
            cases[0][i] = i + 1;
        }
        for (int i = 1; i < nums.length; i++) {
            currCases = new int[maxShift[i] + 1];
            currCases[0] = 1;
            for (int j = 1; j < currCases.length; j++) {
                int prevCases =
                        j < cases[i - 1].length
                                ? cases[i - 1][j]
                                : cases[i - 1][cases[i - 1].length - 1];
                currCases[j] = (currCases[j - 1] + prevCases) % (1_000_000_000 + 7);
            }
            cases[i] = currCases;
        }
        return cases;
    }
}
