package g2001_2100.s2073_time_needed_to_buy_tickets;

// #Easy #Array #Simulation #Queue #2022_05_27_Time_0_ms_(100.00%)_Space_41.9_MB_(45.92%)

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                res += Math.min(tickets[k], tickets[i]);
            } else {
                res += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        return res;
    }
}
