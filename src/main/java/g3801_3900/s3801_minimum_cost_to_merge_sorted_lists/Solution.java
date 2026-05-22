package g3801_3900.s3801_minimum_cost_to_merge_sorted_lists;

// #Hard #Array #Dynamic_Programming #Binary_Search #Two_Pointers #Bit_Manipulation #Senior_Staff
// #Weekly_Contest_483 #2026_05_22_Time_251_ms_(89.19%)_Space_47.69_MB_(83.78%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    private int numLt(int[][] lists, int enabled, int guess) {
        int result = 0;
        for (int i = 0; i < lists.length; i++) {
            if (((enabled >> i) & 1) == 1) {
                int[] list = lists[i];
                int low = 0;
                int high = list.length;
                while (low < high) {
                    int mid = (low + high) / 2;
                    if (list[mid] < guess) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }
                result += low;
            }
        }
        return result;
    }

    public long minMergeCost(int[][] lists) {
        int n = lists.length;

        List<Integer> allNums = getSortedNumbers(lists);
        long[][] subsets = buildSubsetInfo(lists, allNums);

        long[] dp = new long[1 << n];
        Arrays.fill(dp, Long.MAX_VALUE);

        for (int subset = 0; subset < (1 << n); subset++) {
            if (Integer.bitCount(subset) <= 1) {
                dp[subset] = 0;
                continue;
            }

            dp[subset] = calculateMinCost(subset, subsets, dp);
        }

        return dp[(1 << n) - 1];
    }

    private List<Integer> getSortedNumbers(int[][] lists) {
        List<Integer> allNums = new ArrayList<>();

        for (int[] lst : lists) {
            for (int num : lst) {
                allNums.add(num);
            }
        }

        Collections.sort(allNums);
        return allNums;
    }

    private long[][] buildSubsetInfo(int[][] lists, List<Integer> allNums) {
        int n = lists.length;
        long[][] subsets = new long[1 << n][2];

        for (int subset = 1; subset < (1 << n); subset++) {
            int resultLen = getSubsetLength(lists, subset);
            int medianLt = (resultLen - 1) / 2;

            subsets[subset][0] = resultLen;
            subsets[subset][1] = findMedian(lists, subset, medianLt, allNums);
        }

        return subsets;
    }

    private int getSubsetLength(int[][] lists, int subset) {
        int resultLen = 0;

        for (int i = 0; i < lists.length; i++) {
            if (((subset >> i) & 1) == 1) {
                resultLen += lists[i].length;
            }
        }

        return resultLen;
    }

    private int findMedian(int[][] lists, int subset, int medianLt, List<Integer> allNums) {

        int low = 0;
        int high = allNums.size() - 1;
        int actualMedian = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int num = allNums.get(mid);

            if (numLt(lists, subset, num) <= medianLt) {
                actualMedian = num;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return actualMedian;
    }

    private long calculateMinCost(int subset, long[][] subsets, long[] dp) {
        long minCost = Long.MAX_VALUE;

        int a = (subset - 1) & subset;

        while (a > 0) {
            int b = subset ^ a;

            long aLen = subsets[a][0];
            long aMedian = subsets[a][1];
            long bLen = subsets[b][0];
            long bMedian = subsets[b][1];

            long cost = aLen + bLen + Math.abs(aMedian - bMedian);

            minCost = Math.min(minCost, dp[a] + dp[b] + cost);

            a = (a - 1) & subset;
        }

        return minCost;
    }
}
