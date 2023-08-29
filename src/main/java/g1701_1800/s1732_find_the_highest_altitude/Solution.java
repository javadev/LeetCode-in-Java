package g1701_1800.s1732_find_the_highest_altitude;

// #Easy #Array #Prefix_Sum #2022_04_28_Time_0_ms_(100.00%)_Space_40.1_MB_(83.65%)

public class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] altitudes = new int[gain.length + 1];
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
            max = Math.max(max, altitudes[i + 1]);
        }
        return max;
    }
}
