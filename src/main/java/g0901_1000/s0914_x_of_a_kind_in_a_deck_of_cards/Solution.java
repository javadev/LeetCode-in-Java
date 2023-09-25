package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards;

// #Easy #Array #Hash_Table #Math #Counting #Number_Theory
// #2022_07_14_Time_11_ms_(51.18%)_Space_52.7_MB_(22.45%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int j : deck) {
            if (hmap.containsKey(j)) {
                hmap.put(j, hmap.get(j) + 1);
            } else {
                hmap.put(j, 1);
            }
        }
        int x = hmap.get(deck[0]);
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            x = gcd(x, entry.getValue());
        }
        return x >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
