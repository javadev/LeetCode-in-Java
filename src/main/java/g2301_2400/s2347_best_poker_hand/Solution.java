package g2301_2400.s2347_best_poker_hand;

// #Easy #Array #Hash_Table #Counting #2022_07_26_Time_1_ms_(76.92%)_Space_41.6_MB_(30.77%)

import java.util.HashMap;

public class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char suit : suits) {
            if (map.containsKey(suit)) {
                map.put(suit, map.get(suit) + 1);
                if (map.get(suit) == 5) {
                    return "Flush";
                }
            } else {
                map.put(suit, 1);
            }
        }
        String s = "";
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int rank : ranks) {
            if (map2.containsKey(rank)) {
                map2.put(rank, map2.get(rank) + 1);
                if (map2.get(rank) == 2) {
                    s = "Pair";
                } else if (map2.get(rank) == 3) {
                    s = "Three of a Kind";
                    return s;
                }
            } else {
                map2.put(rank, 1);
            }
        }
        return s.isEmpty() ? "High Card" : s;
    }
}
