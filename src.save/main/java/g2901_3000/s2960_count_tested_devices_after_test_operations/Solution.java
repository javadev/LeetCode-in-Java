package g2901_3000.s2960_count_tested_devices_after_test_operations;

// #Easy #Array #Simulation #2024_01_15_Time_0_ms_(100.00%)_Space_43.4_MB_(43.00%)

public class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        int diff = 0;
        for (int n : batteryPercentages) {
            if (n - diff > 0) {
                count++;
                diff++;
            }
        }
        return count;
    }
}
