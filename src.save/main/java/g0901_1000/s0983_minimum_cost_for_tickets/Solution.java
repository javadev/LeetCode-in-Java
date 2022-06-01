package g0901_1000.s0983_minimum_cost_for_tickets;

// #Medium #Array #Dynamic_Programming #2022_03_31_Time_1_ms_(93.95%)_Space_42.5_MB_(28.58%)

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] memo = new int[days.length + 1];
        memo[memo.length - 1] = 0;
        for (int i = days.length - 1; i >= 0; i--) {
            memo[i] =
                    Math.min(
                            Math.min(
                                    costs[0] + memo[getNext(days, i, days[i])],
                                    costs[1] + memo[getNext(days, i, days[i] + 6)]),
                            costs[2] + memo[getNext(days, i, days[i] + 29)]);
        }
        return memo[0];
    }

    public static int getNext(int[] days, int index, int goodUntil) {
        while (index < days.length && days[index] <= goodUntil) {
            index++;
        }
        return index;
    }
}
