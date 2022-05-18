package g1901_2000.s1953_maximum_number_of_weeks_for_which_you_can_work;

// #Medium #Array #Greedy #2022_05_18_Time_4_ms_(40.93%)_Space_77.6_MB_(67.51%)

public class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        long max = 0;
        for (int m : milestones) {
            sum += m;
            max = Math.max(max, m);
        }
        return sum - max + 1 >= max ? sum : 1 + 2 * (sum - max);
    }
}
