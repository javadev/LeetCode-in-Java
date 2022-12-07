package g2401_2500.s2438_range_product_queries_of_powers;

// #Medium #Array #Bit_Manipulation #Prefix_Sum
// #2022_12_07_Time_73_ms_(65.07%)_Space_134.1_MB_(41.58%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int length = queries.length;
        final long mod = (long) (1e9 + 7);
        // convert n to binary form
        // take the set bit and find the corresponding 2^i
        // now answer for the query
        int[] powerTracker = new int[32];
        List<Long> productTakingPowers = new ArrayList<>();
        int[] result = new int[length];
        fillPowerTracker(powerTracker, n);
        fillProductTakingPowers(productTakingPowers, powerTracker);
        int index = 0;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            long product = 1;
            for (int i = left; i <= right; i++) {
                product = (product * productTakingPowers.get(i)) % mod;
            }
            result[index++] = (int) (product % mod);
        }
        return result;
    }

    private void fillPowerTracker(int[] powerTracker, int n) {
        int index = 0;
        while (n > 0) {
            powerTracker[index++] = n & 1;
            n >>= 1;
        }
    }

    private void fillProductTakingPowers(List<Long> productTakingPowers, int[] powerTracker) {
        for (int i = 0; i < 32; i++) {
            if (powerTracker[i] == 1) {
                long power = (long) (Math.pow(2, i));
                productTakingPowers.add(power);
            }
        }
    }
}
