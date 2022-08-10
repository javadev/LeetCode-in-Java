package g0501_0600.s0575_distribute_candies;

// #Easy #Array #Hash_Table #2022_08_10_Time_67_ms_(42.81%)_Space_111.2_MB_(25.92%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
