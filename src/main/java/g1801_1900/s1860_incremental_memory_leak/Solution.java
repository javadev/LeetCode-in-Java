package g1801_1900.s1860_incremental_memory_leak;

// #Medium #Simulation #2022_05_08_Time_5_ms_(78.57%)_Space_41.9_MB_(34.69%)

public class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int time = 1;
        while (memory1 >= time || memory2 >= time) {
            if (memory1 >= memory2) {
                memory1 -= time;
            } else {
                memory2 -= time;
            }
            time++;
        }
        return new int[] {time, memory1, memory2};
    }
}
