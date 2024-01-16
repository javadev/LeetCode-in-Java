package g1601_1700.s1648_sell_diminishing_valued_colored_balls;

// #Medium #Array #Math #Sorting #Greedy #Binary_Search #Heap_Priority_Queue
// #Binary_Search_II_Day_19 #2022_04_22_Time_27_ms_(80.64%)_Space_56.4_MB_(80.28%)

import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] inventory, int orders) {
        int n = inventory.length;
        long mod = (long) 1e9 + 7;
        long totalValue = 0;
        Arrays.sort(inventory);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            count++;
            if (i == 0 || inventory[i] > inventory[i - 1]) {
                long diff = i == 0 ? inventory[i] : inventory[i] - inventory[i - 1];
                if (count * diff < orders) {
                    totalValue += (2L * inventory[i] - diff + 1) * diff * count / 2 % mod;
                    orders -= count * diff;
                } else {
                    diff = orders / count;
                    long remainder = orders % count;
                    totalValue += (2L * inventory[i] - diff + 1) * diff * count / 2 % mod;
                    totalValue += (inventory[i] - diff) * remainder % mod;
                    totalValue %= mod;
                    break;
                }
            }
        }
        return (int) totalValue;
    }
}
