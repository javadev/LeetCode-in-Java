package g1101_1200.s1103_distribute_candies_to_people;

// #Easy #Math #Simulation #2022_02_28_Time_2_ms_(49.07%)_Space_41.9_MB_(19.20%)

public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] candiesDistribution = new int[num_people];
        int count = 1;

        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
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
