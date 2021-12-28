package g0401_0500.s0473_matchsticks_to_square;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask

public class Solution {
    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) {
            return false;
        }
        int totalSum = 0;
        for (int m : matchsticks){
            totalSum += m;
        }
        if (totalSum % 4 != 0) {
            return false;
        }
        int target = totalSum / 4;
        boolean[] used = new boolean[matchsticks.length];
        return backtracking(matchsticks, used, target, 0, 0, 0);
    }

    private boolean backtracking(int[] matchsticks, boolean[] used, int target, int count, int currSum, int start) {
        if (count == 3) {
            return true;
        }
        if (currSum > target) {
            return false;
        }
        if (currSum == target) {
            return backtracking(matchsticks, used, target, count + 1, 0, 0);
        }
        for (int i = start; i < matchsticks.length; i++) {
            if (!used[i]) {
                used[i] = true;
                if (backtracking(matchsticks, used, target, count, currSum + matchsticks[i], i + 1)) return true;
                used[i] = false;
            }
        }
        return false;
    }
}