package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards;

// #Easy #Array #Hash_Table #Math #Counting #Number_Theory

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) {
            return false;
        }

        Map<Integer, Integer> mapReps = new HashMap<>();
        for (int card : deck) {
            if (!mapReps.containsKey(card)) {
                mapReps.put(card, 1);
            } else {
                mapReps.put(card, mapReps.get(card) + 1);
            }
        }

        int num = 0;
        int[] arrReps = new int[mapReps.size()];
        for (Map.Entry<Integer, Integer> e : mapReps.entrySet()) {
            arrReps[num++] = e.getValue();
        }

        num = arrGCD(arrReps, arrReps.length);

        return num > 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int arrGCD(int[] arr, int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);
        }

        return result;
    }
}
