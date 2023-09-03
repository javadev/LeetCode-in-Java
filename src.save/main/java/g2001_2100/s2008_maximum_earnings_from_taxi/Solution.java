package g2001_2100.s2008_maximum_earnings_from_taxi;

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search
// #2022_05_23_Time_116_ms_(55.59%)_Space_135.7_MB_(5.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        if (rides.length == 1) {
            return calculateEarnings(rides[0]);
        }

        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] ride : rides) {
            map.compute(ride[1], (k, v) -> (v == null) ? new ArrayList<>() : v).add(ride);
        }

        long[] maximisedEarnings = new long[n + 1];
        Arrays.fill(maximisedEarnings, 0);
        for (int i = 1; i < maximisedEarnings.length; i++) {
            maximisedEarnings[i] = maximisedEarnings[i - 1];
            List<int[]> passengers = map.get(i);
            if (passengers != null) {
                for (int[] passenger : passengers) {
                    final int earning = calculateEarnings(passenger);
                    maximisedEarnings[i] =
                            Math.max(
                                    maximisedEarnings[i],
                                    maximisedEarnings[passenger[0]] + earning);
                }
            }
        }
        return maximisedEarnings[n];
    }

    private int calculateEarnings(final int[] currentRide) {
        return currentRide[1] - currentRide[0] + currentRide[2];
    }
}
