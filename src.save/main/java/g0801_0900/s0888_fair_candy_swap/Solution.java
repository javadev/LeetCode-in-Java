package g0801_0900.s0888_fair_candy_swap;

// #Easy #Array #Hash_Table #Sorting #Binary_Search

import java.util.HashSet;

public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = 0;
        int bSum = 0;
        int diff;
        int[] ans = new int[2];
        for (int bar : aliceSizes) {
            aSum += bar;
        }
        for (int bar : bobSizes) {
            bSum += bar;
        }
        diff = aSum - bSum;
        HashSet<Integer> set = new HashSet<>();
        for (int bar : aliceSizes) {
            set.add(bar);
        }
        for (int bar : bobSizes) {
            if (set.contains(bar + diff / 2)) {
                ans[0] = bar + diff / 2;
                ans[1] = bar;
                break;
            }
        }
        return ans;
    }
}
