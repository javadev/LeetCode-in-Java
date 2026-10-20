package g3901_4000.s3964_minimum_lights_to_illuminate_a_road;

// #Medium #Array #Prefix_Sum #Staff #Biweekly_Contest_185
// #2026_10_20_Time_7_ms_(100.00%)_Space_204.80_MB_(14.68%)

public class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        for (int i = 0; i < n; i++) {
            if (lights[i] != 0) {
                int pos = Math.max(0, i - lights[i]);
                lights[pos] = Math.max(lights[i], lights[pos]);
            }
        }
        int ans = 0;
        int coverage = 0;
        for (int i = 0; i < n; i++) {
            if (lights[i] == 0 && coverage == 0) {
                ans++;
                if (i + 1 < n && lights[i + 1] == 0) {
                    coverage = 3;
                }
            }
            coverage--;
            coverage = Math.max(coverage, lights[i]);
        }
        return ans;
    }
}
