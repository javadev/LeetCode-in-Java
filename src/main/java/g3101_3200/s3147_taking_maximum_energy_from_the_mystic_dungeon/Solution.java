package g3101_3200.s3147_taking_maximum_energy_from_the_mystic_dungeon;

// #Medium #Array #Prefix_Sum #2024_05_15_Time_2_ms_(97.58%)_Space_59.8_MB_(75.38%)

public class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int n = energy.length;
        for (int i = n - 1; i >= n - k; i--) {
            int en = 0;
            for (int j = i; j >= 0; j -= k) {
                en += energy[j];
                max = Math.max(en, max);
            }
        }
        return max;
    }
}
