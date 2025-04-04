package g3401_3500.s3457_eat_pizzas;

// #Medium #Array #Sorting #Greedy #2025_02_21_Time_16_ms_(100.00%)_Space_75.98_MB_(97.29%)

public class Solution {
    public long maxWeight(int[] pizzas) {
        int max = 0;
        for (int x : pizzas) {
            max = Math.max(max, x);
        }
        int[] count = new int[max + 1];
        for (int x : pizzas) {
            count[x]++;
        }
        int m = pizzas.length;
        int n = m / 4;
        int index = 0;
        for (int x = max; x > 0; --x) {
            if (count[x] != 0) {
                int c = count[x];
                while (c-- > 0) {
                    pizzas[index++] = x;
                }
                if (index >= m / 2) {
                    break;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < (n + 1) / 2; ++i) {
            ans += pizzas[i];
        }
        int k = n - (n + 1) / 2;
        for (int i = (n + 1) / 2 + 1; k > 0; i += 2, k--) {
            ans += pizzas[i];
        }
        return ans;
    }
}
