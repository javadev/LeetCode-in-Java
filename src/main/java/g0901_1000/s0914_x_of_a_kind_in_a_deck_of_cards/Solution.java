package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards;

// #Easy #Array #Hash_Table #Math #Counting #Number_Theory
// #2022_07_14_Time_11_ms_(51.18%)_Space_52.7_MB_(22.45%)

import java.util.HashMap;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (hmap.containsKey(deck[i])) {
                hmap.put(deck[i], hmap.get(deck[i]) + 1);
            } else {
                hmap.put(deck[i], 1);
            }
        }
        int x = hmap.get(deck[0]);
        for (Integer i : hmap.keySet()) {
            x = gcd(x, hmap.get(i));
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
