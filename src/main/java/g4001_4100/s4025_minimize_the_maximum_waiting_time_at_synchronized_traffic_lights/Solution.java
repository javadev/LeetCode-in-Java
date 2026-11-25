package g4001_4100.s4025_minimize_the_maximum_waiting_time_at_synchronized_traffic_lights;

// #Medium #Array #Greedy #Senior #Weekly_Contest_515
// #2026_11_25_Time_3_ms_(100.00%)_Space_121.58_MB_(33.61%)

public class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int greenMax = Integer.MIN_VALUE;
        for (int light : lights) {
            greenMax = Math.max(greenMax, light);
        }
        int ans = 0;
        for (int i : arrivalTime) {
            int r = i % period;
            int curr = period - r;

            if (r >= greenMax) {
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }
}
