package g3601_3700.s3639_minimum_time_to_activate_string;

// #Medium #Weekly_Contest_461 #2025_08_03_Time_122_ms_(100.00%)_Space_58.43_MB_(100.00%)

import java.util.TreeSet;

public class Solution {
    public int minTime(String s, int[] order, int k) {
        int n = s.length();
        // Use a TreeSet to maintain a sorted list of indices
        TreeSet<Integer> pos = new TreeSet<>();
        pos.add(-1);
        pos.add(n);
        // Iterate through the order of removal
        int localK = k;
        for (int t = 0; t < order.length; ++t) {
            int i = order[t];
            // Find the elements in the sorted set that bracket the current index 'i'
            // 'r' is the smallest element >= i
            Integer r = pos.ceiling(i);
            // 'l' is the largest element <= i
            Integer l = pos.floor(i);
            // The 'cost' to remove an item is the product of the distances to its neighbors
            localK -= (int) ((long) (i - l) * (r - i));
            pos.add(i);
            // If the total cost is exhausted, return the current time 't'
            if (localK <= 0) {
                return t;
            }
        }
        // If all items are removed and k is not exhausted, return -1
        return -1;
    }
}
