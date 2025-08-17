package g3601_3700.s3648_minimum_sensors_to_cover_grid;

// #Medium #Biweekly_Contest_163 #2025_08_17_Time_0_ms_(100.00%)_Space_41.03_MB_(100.00%)

public class Solution {
    public int minSensors(int n, int m, int k) {
        int size = k * 2 + 1;
        int x = n / size + (n % size == 0 ? 0 : 1);
        int y = m / size + (m % size == 0 ? 0 : 1);
        return x * y;
    }
}
