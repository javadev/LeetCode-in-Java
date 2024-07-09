package g3201_3300.s3207_maximum_points_after_enemy_battles;

// #Medium #Array #Greedy #2024_07_09_Time_1_ms_(100.00%)_Space_55.5_MB_(99.34%)

public class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        int n = enemyEnergies.length;
        int min = enemyEnergies[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, enemyEnergies[i]);
        }
        if (currentEnergy == 0 || currentEnergy < min) {
            return 0;
        }
        long sum = currentEnergy;
        for (int i = n - 1; i >= 0; i--) {
            sum += enemyEnergies[i];
        }
        sum -= min;
        return sum / min;
    }
}
