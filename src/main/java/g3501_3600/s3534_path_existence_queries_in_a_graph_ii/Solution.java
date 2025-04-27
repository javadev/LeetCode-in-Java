package g3501_3600.s3534_path_existence_queries_in_a_graph_ii;

// #Hard #2025_04_27_Time_86_ms_(94.64%)_Space_80.87_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] position = new int[n];
        int[] values = new int[n];
        Integer[] sortedIndices = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedIndices[i] = i;
        }
        Arrays.sort(sortedIndices, (a, b) -> Integer.compare(nums[a], nums[b]));
        for (int i = 0; i < n; i++) {
            position[sortedIndices[i]] = i;
            values[i] = nums[sortedIndices[i]];
        }
        int[] reachableIndex = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < i) {
                j = i;
            }
            while (j + 1 < n && values[j + 1] - values[i] <= maxDiff) {
                j++;
            }
            reachableIndex[i] = j;
        }
        int maxLog = 1;
        while ((1 << maxLog) < n) {
            maxLog++;
        }
        int[][] upTable = new int[maxLog][n];
        upTable[0] = reachableIndex.clone();
        for (int k = 1; k < maxLog; k++) {
            for (int i = 0; i < n; i++) {
                upTable[k][i] = upTable[k - 1][upTable[k - 1][i]];
            }
        }
        int[] results = new int[queries.length];
        for (int idx = 0; idx < queries.length; idx++) {
            int start = queries[idx][0];
            int end = queries[idx][1];
            if (start == end) {
                results[idx] = 0;
                continue;
            }
            int startPos = position[start];
            int endPos = position[end];
            if (startPos > endPos) {
                int temp = startPos;
                startPos = endPos;
                endPos = temp;
            }
            if (Math.abs(nums[start] - nums[end]) <= maxDiff) {
                results[idx] = 1;
                continue;
            }
            if (reachableIndex[startPos] < endPos) {
                int current = startPos;
                int jumpCount = 0;
                for (int k = maxLog - 1; k >= 0; k--) {
                    if (upTable[k][current] < endPos) {
                        if (upTable[k][current] == current) {
                            break;
                        }
                        current = upTable[k][current];
                        jumpCount += 1 << k;
                    }
                }
                if (reachableIndex[current] >= endPos) {
                    results[idx] = jumpCount + 1;
                } else {
                    results[idx] = -1;
                }
            } else {
                results[idx] = 1;
            }
        }
        return results;
    }
}
