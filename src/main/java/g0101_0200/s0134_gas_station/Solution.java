package g0101_0200.s0134_gas_station;

// #Medium #Top_Interview_Questions #Array #Greedy #Top_Interview_150_Array/String
// #2025_03_06_Time_2_ms_(97.52%)_Space_57.00_MB_(5.82%)

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int total = 0;
        int current = 0;
        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            total += balance;
            current += balance;
            if (current < 0) {
                index = i + 1;
                current = 0;
            }
        }
        return total >= 0 ? index : -1;
    }
}
