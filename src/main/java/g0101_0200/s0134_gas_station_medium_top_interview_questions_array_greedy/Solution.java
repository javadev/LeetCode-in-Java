package g0101_0200.s0134_gas_station_medium_top_interview_questions_array_greedy;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int curGas = 0;
        int result = -1;
        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            // re-calculate the starting point
            if (curGas < 0) {
                result = -1;
                curGas = 0;
            } else if (result == -1) {
                // set initial starting point
                result = i;
            }
            sumGas += gas[i];
            sumCost += cost[i];
        }
        if (sumGas < sumCost) {
            return -1;
        }
        return result;
    }
}
