package g0701_0800.s0787_cheapest_flights_within_k_stops;

// #Medium #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue
// #Graph #Shortest_Path #2022_03_26_Time_9_ms_(53.93%)_Space_46.9_MB_(59.68%)

import java.util.Arrays;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // k + 2 becase there are total of k(intermediate stops) + 1(src) + 1(dst)
        // dp[i][j] = cost to reach j using atmost i edges from src
        int[][] dp = new int[k + 2][n];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        // cost to reach src is always 0
        for (int i = 0; i <= k + 1; i++) {
            dp[i][src] = 0;
        }
        // k+1 because k stops + dst
        for (int i = 1; i <= k + 1; i++) {
            for (int[] flight : flights) {
                int srcAirport = flight[0];
                int destAirport = flight[1];
                int cost = flight[2];
                // if cost to reach srcAirport in i - 1 steps is already found out then
                // the cost to reach destAirport will be min(cost to reach destAirport computed
                // already from some other srcAirport OR cost to reach srcAirport in i - 1 steps +
                // the cost to reach destAirport from srcAirport)
                if (dp[i - 1][srcAirport] != Integer.MAX_VALUE) {
                    dp[i][destAirport] = Math.min(dp[i][destAirport], dp[i - 1][srcAirport] + cost);
                }
            }
        }
        // checking for dp[k + 1][dst] because there are 'k + 2' airports in a path and distance
        // covered between 'k + 2' airports is 'k + 1'
        return dp[k + 1][dst] == Integer.MAX_VALUE ? -1 : dp[k + 1][dst];
    }
}
