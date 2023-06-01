package g1101_1200.s1103_distribute_candies_to_people;

// #Easy #Math #Simulation #2023_06_01_Time_1_ms_(97.48%)_Space_40.8_MB_(8.63%)

public class Solution {
    public int[] distributeCandies(int candies, int numPeople) {
        int[] candiesDistribution = new int[numPeople];
        int count = 1;
        while (candies > 0) {
            for (int i = 0; i < numPeople; i++) {
                if (candies >= count) {
                    candiesDistribution[i] += count;
                    candies -= count;
                    count++;
                } else if (candies > 0) {
                    candiesDistribution[i] += candies;
                    candies -= candies;
                }
                if (candies == 0) {
                    return candiesDistribution;
                }
            }
        }
        return candiesDistribution;
    }
}
