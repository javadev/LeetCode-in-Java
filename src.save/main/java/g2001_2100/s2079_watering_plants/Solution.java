package g2001_2100.s2079_watering_plants;

// #Medium #Array #2022_05_29_Time_0_ms_(100.00%)_Space_43.3_MB_(26.31%)

public class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int initial = capacity;
        int ans = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= capacity) {
                ++ans;
                capacity -= plants[i];
            } else {
                ans += i;
                capacity = initial;
                ans += i + 1;
                capacity -= plants[i];
            }
        }
        return ans;
    }
}
