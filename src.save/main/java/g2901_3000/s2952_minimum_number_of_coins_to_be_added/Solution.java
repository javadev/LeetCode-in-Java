package g2901_3000.s2952_minimum_number_of_coins_to_be_added;

// #Medium #Array #Sorting #Greedy #2024_01_15_Time_21_ms_(98.49%)_Space_61.9_MB_(5.41%)

import java.util.Arrays;

public class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        int res = 0;
        int num = 0;
        int i = 0;
        Arrays.sort(coins);
        while (num < target) {
            if (i < coins.length && coins[i] <= num + 1) {
                num += coins[i];
                i++;
            } else {
                res += 1;
                num += num + 1;
            }
        }
        return res;
    }
}
