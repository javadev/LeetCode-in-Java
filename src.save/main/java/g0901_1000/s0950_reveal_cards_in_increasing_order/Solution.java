package g0901_1000.s0950_reveal_cards_in_increasing_order;

// #Medium #Array #Sorting #Simulation #Queue #2022_12_26_Time_1_ms_(100.00%)_Space_42.5_MB_(85.25%)

import java.util.Arrays;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] result = new int[n * 2];
        int idx = result.length - 1;
        int lastIdx = result.length - 1;
        int i = n - 1;
        while (idx >= 0 && i >= 0) {
            if (i != (n - 1)) {
                result[idx--] = result[lastIdx--];
            }
            result[idx--] = deck[i--];
        }
        return Arrays.copyOfRange(result, idx + 1, lastIdx + 1);
    }
}
