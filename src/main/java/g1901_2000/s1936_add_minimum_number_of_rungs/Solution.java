package g1901_2000.s1936_add_minimum_number_of_rungs;

// #Medium #Array #Greedy #2022_05_15_Time_1_ms_(100.00%)_Space_54_MB_(89.37%)

public class Solution {
    public int addRungs(int[] rungs, int dist) {
        int addons = 0;
        int currentHeight = 0;
        int i = 0;
        while (i < rungs.length) {
            int nextRung = rungs[i];
            if (nextRung - currentHeight <= dist) {
                currentHeight = nextRung;
                i++;
            } else {
                int adds = (nextRung - currentHeight - 1) / dist;
                addons += adds;
                currentHeight += dist * adds;
            }
        }
        return addons;
    }
}
