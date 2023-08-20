package g2101_2200.s2162_minimum_cost_to_set_cooking_time;

// #Medium #Math #Enumeration #2022_06_04_Time_1_ms_(95.82%)_Space_40.8_MB_(69.87%)

public class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int mins = targetSeconds / 60;
        int secs = targetSeconds % 60;
        return Math.min(
                cost(mins, secs, startAt, moveCost, pushCost),
                cost(mins - 1, secs + 60, startAt, moveCost, pushCost));
    }

    private int cost(int mins, int secs, int startAt, int moveCost, int pushCost) {
        if (mins > 99 || secs > 99 || mins < 0 || secs < 0) {
            return Integer.MAX_VALUE;
        }
        String s = Integer.toString(mins * 100 + secs);
        char curr = (char) (startAt + '0');
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                res += pushCost;
            } else {
                res += pushCost + moveCost;
                curr = s.charAt(i);
            }
        }
        return res;
    }
}
