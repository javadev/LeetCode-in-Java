package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel;

// #Medium #Array #Simulation #2022_04_08_Time_4_ms_(95.65%)_Space_75.6_MB_(52.17%)

public class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int maxProfit = 0;
        int shift = -1;
        int waiting = 0;
        int profit = 0;
        for (int i = 0; i < customers.length; i++) {
            // In each shift adding new passenger to the waiting line
            waiting += customers[i];
            profit += Math.min(waiting, 4) * boardingCost - runningCost;
            if (profit > maxProfit) {
                shift = i + 1;
                maxProfit = profit;
            }
            waiting = Math.max(waiting - 4, 0);
        }
        // profitable to serve all the remaining waiting line?
        if (boardingCost * 4 > runningCost) {
            shift += waiting / 4;
            // profitable for the last round?
            shift += waiting % 4 * boardingCost - runningCost > 0 ? 1 : 0;
        }
        return shift;
    }
}
