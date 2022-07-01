package g0401_0500.s0475_heaters;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2022_03_18_Time_8_ms_(99.30%)_Space_44.2_MB_(90.36%)

import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        int m = houses.length;
        int n = heaters.length;
        int hs = 0;
        int ht = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if (n == 1) {
            return Math.max(Math.abs(houses[0] - heaters[0]), Math.abs(houses[m - 1] - heaters[0]));
        }
        while (hs < m && ht < n - 1) {
            if (houses[hs] <= heaters[ht]) {
                res = Math.max(heaters[ht] - houses[hs], res);
                hs++;
            } else if (houses[hs] <= heaters[ht + 1]) {
                res =
                        Math.max(
                                res,
                                Math.min(houses[hs] - heaters[ht], heaters[ht + 1] - houses[hs]));
                hs++;
            } else {
                ht++;
            }
        }
        if (ht == n - 1) {
            res = Math.max(res, houses[m - 1] - heaters[n - 1]);
        }
        return res;
    }
}
