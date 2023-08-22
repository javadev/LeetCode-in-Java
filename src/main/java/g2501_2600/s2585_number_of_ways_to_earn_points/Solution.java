package g2501_2600.s2585_number_of_ways_to_earn_points;

// #Hard #Array #Dynamic_Programming #2023_08_22_Time_56_ms_(76.40%)_Space_43.9_MB_(21.91%)

public class Solution {
    private static final int MOD = 1000000007;
    private Integer[][] memo;

    private int helper(int[][] types, int target, int typeIndex) {
        int n = types.length;
        if (typeIndex >= n) {
            return target == 0 ? 1 : 0;
        }
        if (memo[typeIndex][target] != null) {
            return memo[typeIndex][target];
        }
        int ways = 0;
        ways = (ways + helper(types, target, typeIndex + 1)) % MOD;
        int currQuestCount = types[typeIndex][0];
        int currQuestPoint = types[typeIndex][1];
        int pointsEarned;
        for (int quest = 1; quest <= currQuestCount; quest++) {
            pointsEarned = quest * currQuestPoint;
            if (pointsEarned > target) {
                break;
            }
            ways = (ways + helper(types, target - pointsEarned, typeIndex + 1)) % MOD;
        }
        memo[typeIndex][target] = ways;
        return memo[typeIndex][target];
    }

    public int waysToReachTarget(int target, int[][] types) {
        int n = types.length;
        memo = new Integer[n + 1][target + 1];
        return helper(types, target, 0);
    }
}
