package g0501_0600.s0575_distribute_candies;

// #Easy #Array #Hash_Table

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) set.add(i);
        return Math.min(set.size(), candyType.length / 2);
    }
}
