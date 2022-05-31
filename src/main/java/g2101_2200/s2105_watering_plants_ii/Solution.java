package g2101_2200.s2105_watering_plants_ii;

// #Medium #Array #Two_Pointers #Simulation #2022_05_31_Time_5_ms_(78.24%)_Space_84_MB_(48.24%)

public class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int i = 0;
        int j = n - 1;
        int aRefill = 0;
        int bRefill = 0;
        int initialCapacityA = capacityA;
        int initialCapacityB = capacityB;

        while (i <= j) {
            if (i == j) {
                if (!(capacityA >= plants[i] || capacityB >= plants[i])) {
                    aRefill++;
                }
                i++;
                continue;
            }

            if (capacityA >= plants[i]) {
                capacityA = capacityA - plants[i];
            } else {
                aRefill++;
                capacityA = initialCapacityA - plants[i];
            }

            if (capacityB >= plants[j]) {
                capacityB = capacityB - plants[j];
            } else {
                bRefill++;
                capacityB = initialCapacityB - plants[j];
            }
            i++;
            j--;
        }

        return (aRefill + bRefill);
    }
}
