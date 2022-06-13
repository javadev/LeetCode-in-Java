package g2201_2300.s2260_minimum_consecutive_cards_to_pick_up;

// #Medium #Array #Hash_Table #Sliding_Window #2022_06_13_Time_50_ms_(97.04%)_Space_52.5_MB_(98.34%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumCardPickup(int[] cards) {
        int mindiff = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                int j = map.get(cards[i]);
                mindiff = Math.min(mindiff, i - j + 1);
            }
            map.put(cards[i], i);
        }
        if (mindiff == Integer.MAX_VALUE) {
            return -1;
        }
        return mindiff;
    }
}
