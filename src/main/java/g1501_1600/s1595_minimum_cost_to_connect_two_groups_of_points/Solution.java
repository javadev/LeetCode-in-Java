package g1501_1600.s1595_minimum_cost_to_connect_two_groups_of_points;

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
// #2022_04_07_Time_74_ms_(64.83%)_Space_41.4_MB_(96.55%)

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("java:S6213")
public class Solution {
    public int connectTwoGroups(List<List<Integer>> cost) {
        // size of set 1
        int m = cost.size();
        // size of set 2
        int n = cost.get(0).size();
        int mask = 1 << m;
        // min cost to connect nodes in set 1 (of different states);
        int[] record = new int[mask];
        Arrays.fill(record, Integer.MAX_VALUE);
        // since we use record to get the min cost of connecting nodes in set 1
        // we shall go through nodes in set 2 one by one, to make sure they are connected
        // base case:
        record[0] = 0;
        for (int col = 0; col < n; col++) {
            int[] tmpRecord = new int[mask];
            Arrays.fill(tmpRecord, Integer.MAX_VALUE);
            // try connection with each of the node in set 1
            for (int row = 0; row < m; row++) {
                for (int msk = 0; msk < mask; msk++) {
                    // the new min cost should be based on the cost record of connecting previous
                    // node in set 2;
                    int newMask = msk | (1 << row);
                    if (record[msk] != Integer.MAX_VALUE) {
                        tmpRecord[newMask] =
                                Math.min(tmpRecord[newMask], record[msk] + cost.get(row).get(col));
                    }
                    // if row nodes in this state has not been connected yet, and the msk is
                    // achievable by connecting the current node
                    // then check whether connect the current node multiple times will benefit the
                    // cost
                    if ((msk & (1 << row)) == 0 && tmpRecord[msk] != Integer.MAX_VALUE) {
                        tmpRecord[newMask] =
                                Math.min(
                                        tmpRecord[newMask],
                                        tmpRecord[msk] + cost.get(row).get(col));
                    }
                }
            }
            // use tmpRecord to update record
            record = tmpRecord;
        }
        return record[(1 << m) - 1];
    }
}
