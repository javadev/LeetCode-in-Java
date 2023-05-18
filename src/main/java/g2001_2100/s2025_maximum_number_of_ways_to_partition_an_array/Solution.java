package g2001_2100.s2025_maximum_number_of_ways_to_partition_an_array;

// #Hard #Array #Hash_Table #Prefix_Sum #Counting #Enumeration
// #2022_05_25_Time_172_ms_(100.00%)_Space_75.5_MB_(65.10%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int waysToPartition(int[] nums, int k) {
        int n = nums.length;
        long[] ps = new long[n];
        ps[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }
        Map<Long, ArrayList<Integer>> partDiffs = new HashMap<>();
        int maxWays = 0;
        for (int i = 1; i < n; i++) {
            long partL = ps[i - 1];
            long partR = ps[n - 1] - partL;
            long partDiff = partR - partL;
            if (partDiff == 0) {
                maxWays++;
            }
            ArrayList<Integer> idxSet =
                    partDiffs.computeIfAbsent(partDiff, k1 -> new ArrayList<>());
            idxSet.add(i);
        }
        for (int j = 0; j < n; j++) {
            int ways = 0;
            long newDiff = (long) k - nums[j];
            ArrayList<Integer> leftList = partDiffs.get(newDiff);
            if (leftList != null) {
                int i = upperBound(leftList, j);
                ways += leftList.size() - i;
            }
            ArrayList<Integer> rightList = partDiffs.get(-newDiff);
            if (rightList != null) {
                int i = upperBound(rightList, j);
                ways += i;
            }
            maxWays = Math.max(ways, maxWays);
        }
        return maxWays;
    }

    private int upperBound(List<Integer> arr, int val) {
        int ans = -1;
        int n = arr.size();
        int l = 0;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid == n) {
                return n;
            }
            if (arr.get(mid) > val) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
