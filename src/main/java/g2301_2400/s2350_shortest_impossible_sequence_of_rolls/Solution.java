package g2301_2400.s2350_shortest_impossible_sequence_of_rolls;

// #Hard #Array #Hash_Table #Greedy #2022_07_30_Time_54_ms_(47.18%)_Space_105.9_MB_(51.39%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int shortestSequence(int[] rolls, int k) {
        int res = 1;
        Set<Integer> set = new HashSet<>();
        for (int roll : rolls) {
            set.add(roll);
            if (set.size() == k) {
                res++;
                set.clear();
            }
        }
        return res;
    }
}
