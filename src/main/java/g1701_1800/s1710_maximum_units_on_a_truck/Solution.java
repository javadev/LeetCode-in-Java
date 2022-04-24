package g1701_1800.s1710_maximum_units_on_a_truck;

// #Easy #Array #Sorting #Greedy #2022_04_24_Time_9_ms_(78.69%)_Space_42.8_MB_(78.53%)

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b1, b2) -> Integer.compare(b2[1], b1[1]));
        int maxUnits = 0;
        int i = 0;
        while (truckSize > 0 && i < boxTypes.length) {
            if (boxTypes[i][0] <= truckSize) {
                maxUnits += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {
                maxUnits += Math.min(truckSize, boxTypes[i][0]) * boxTypes[i][1];
                truckSize -= Math.min(truckSize, boxTypes[i][0]);
            }
            i++;
        }
        return maxUnits;
    }
}
