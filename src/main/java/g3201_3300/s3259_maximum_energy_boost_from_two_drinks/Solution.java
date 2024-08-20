package g3201_3300.s3259_maximum_energy_boost_from_two_drinks;

// #Medium #Array #Dynamic_Programming #2024_08_20_Time_3_ms_(100.00%)_Space_57_MB_(98.29%)

public class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long a0 = 0;
        long a1 = 0;
        long b0 = 0;
        long b1 = 0;
        long n = energyDrinkA.length;
        for (int i = 0; i < n; i++) {
            a1 = Math.max(a0 + energyDrinkA[i], b0);
            b1 = Math.max(b0 + energyDrinkB[i], a0);
            a0 = a1;
            b0 = b1;
        }
        return Math.max(a1, b1);
    }
}
