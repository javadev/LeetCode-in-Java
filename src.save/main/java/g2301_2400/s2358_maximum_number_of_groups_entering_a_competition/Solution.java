package g2301_2400.s2358_maximum_number_of_groups_entering_a_competition;

// #Medium #Array #Math #Greedy #Binary_Search
// #2022_08_14_Time_0_ms_(100.00%)_Space_70.5_MB_(27.33%)

public class Solution {
    public int maximumGroups(int[] grades) {
        int len = grades.length;
        return (int) (-1 + Math.sqrt(1D + 8 * len)) / 2;
    }
}
