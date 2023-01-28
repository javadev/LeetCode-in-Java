package g1001_1100.s1094_car_pooling;

// #Medium #Array #Sorting #Heap_Priority_Queue #Simulation #Prefix_Sum
// #2022_02_22_Time_1_ms_(99.38%)_Space_44.4_MB_(9.80%)

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];
        for (int[] t : trips) {
            stops[t[1]] += t[0];
            stops[t[2]] -= t[0];
        }
        for (int i = 0; capacity >= 0 && i < 1001; ++i) {
            capacity -= stops[i];
        }
        return capacity >= 0;
    }
}
