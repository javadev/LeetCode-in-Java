package g0801_0900.s0822_card_flipping_game;

// #Medium #Array #Hash_Table

public class Solution {

    public int flipgame(int[] fronts, int[] backs) {
        int max = findMax(fronts, backs);
        int value = 10000;
        int[] twin_card_hash = new int[max + 1];
        int[] existing_numbers_hash = new int[max + 1];
        
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                twin_card_hash[fronts[i]]++;
            }
            existing_numbers_hash[fronts[i]]++;
            existing_numbers_hash[backs[i]]++;
        }
        
        for (int i = 1; i <= max; i++) {
            if ((twin_card_hash[i] == 0) && (i < value) && (existing_numbers_hash[i] != 0)) {
                value = i;
                break;
            }
        }
                
        if (value == 10000) {
            return 0;
        }
        else {
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