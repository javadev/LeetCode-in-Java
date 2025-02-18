package g3401_3500.s3457_eat_pizzas;

// #Medium #Array #Sorting #Greedy #2025_02_18_Time_63_ms_(40.14%)_Space_81.02_MB_(36.94%)

import java.util.Arrays;

public class Solution {
    public long maxWeight(int[] pizzas) {
        int n = pizzas.length;
        int m = n / 4;
        int z = (m + 1) / 2;
        int y = m / 2;
        int j = 0;
        Arrays.sort(pizzas);
        long res = 0;
        for (int i = 0; i < z; ++i) {
            res += pizzas[n - 1 - j];
            j += 1;
        }
        for (int i = 0; i < y; ++i) {
            res += pizzas[n - 1 - j - 1];
            j += 2;
        }
        return res;
    }
}
