package g0801_0900.s0822_card_flipping_game;

// #Medium #Array #Hash_Table #2022_03_23_Time_2_ms_(96.55%)_Space_47.7_MB_(65.52%)

public class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int max = findMax(fronts, backs);
        int value = 10000;
        int[] twinCardHash = new int[max + 1];
        int[] existingNumbersHash = new int[max + 1];
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                twinCardHash[fronts[i]]++;
            }
            existingNumbersHash[fronts[i]]++;
            existingNumbersHash[backs[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            if ((twinCardHash[i] == 0) && (i < value) && (existingNumbersHash[i] != 0)) {
                value = i;
                break;
            }
        }
        if (value == 10000) {
            return 0;
        } else {
            return value;
        }
    }

    private static int findMax(int[] fronts, int[] backs) {
        int max = 0;
        for (int front : fronts) {
            if (max < front) {
                max = front;
            }
        }
        for (int back : backs) {
            if (max < back) {
                max = back;
            }
        }
        return max;
    }
}
