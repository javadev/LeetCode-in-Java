package g2001_2100.s2079_watering_plants;

// #Medium #Array #2022_23_05_Time_0_ms(100%)_Space_43.1_MB_(30.50%)

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
