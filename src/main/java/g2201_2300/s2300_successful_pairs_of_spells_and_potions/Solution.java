package g2201_2300.s2300_successful_pairs_of_spells_and_potions;

// #Medium #Array #Two_Pointers #Binary_Search #Sorting
// #2022_06_14_Time_85_ms_(71.70%)_Space_135.9_MB_(33.90%)

import java.util.Arrays;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int l = 0, r = potions.length;
            while (l < r) {
                int m = l + (r - l) / 2;
                if ((long) spells[i] * potions[m] >= success) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            spells[i] = potions.length - l;
        }
        return spells;
    }
}
