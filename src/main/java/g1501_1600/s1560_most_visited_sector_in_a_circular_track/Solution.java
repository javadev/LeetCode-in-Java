package g1501_1600.s1560_most_visited_sector_in_a_circular_track;

// #Easy #Array #Simulation #2022_04_11_Time_1_ms_(88.89%)_Space_43.6_MB_(62.96%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> res = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        int[] ans = new int[n + 1];
        while (start != end) {
            ans[start]++;
            start++;
            if (start > n) {
                start = 1;
            }
        }
        ans[end]++;
        for (int i = 1; i <= n; i++) {
            if (ans[i] != 0) {
                res.add(i);
            }
        }
        return res;
    }
}
