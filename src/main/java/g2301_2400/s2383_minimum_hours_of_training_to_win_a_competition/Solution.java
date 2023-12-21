package g2301_2400.s2383_minimum_hours_of_training_to_win_a_competition;

// #Easy #Array #Greedy #2022_08_25_Time_0_ms_(100.00%)_Space_42.4_MB_(42.86%)

public class Solution {
    public int minNumberOfHours(
            int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int totalEnergy = 0;
        for (int e : energy) {
            totalEnergy += e;
        }
        int result = Math.max(0, totalEnergy - initialEnergy + 1);
        int currentExp = initialExperience;
        int exp;
        for (int i = 0; i < experience.length - 1; ++i) {
            exp = experience[i];
            if (currentExp <= exp) {
                result += exp - currentExp + 1;
                currentExp = exp + 1;
            }
            currentExp += exp;
        }
        int last = experience[experience.length - 1];
        if (currentExp <= last) {
            result += last - currentExp + 1;
        }
        return result;
    }
}
