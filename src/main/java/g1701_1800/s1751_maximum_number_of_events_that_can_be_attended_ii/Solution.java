package g1701_1800.s1751_maximum_number_of_events_that_can_be_attended_ii;

// #Hard #Array #Dynamic_Programming #Binary_Search
// #2022_04_30_Time_12_ms_(98.33%)_Space_84.7_MB_(92.22%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Solution {
    public int maxValue(int[][] events, int k) {
        if (k == 1) {
            Optional<int[]> value = Arrays.stream(events).max(Comparator.comparingInt(e -> e[2]));
            if (value.isPresent()) {
                return value.get()[2];
            } else {
                throw new NullPointerException();
            }
        }

        int n = events.length;
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int[][] memo = new int[n][k + 1];

        return dfs(events, 0, k, memo);
    }

    private int dfs(int[][] events, int i, int k, int[][] memo) {
        if (k == 0 || i >= events.length) {
            return 0;
        }
        if (memo[i][k] > 0) {
            return memo[i][k];
        }

        int idx = binarySearch(events, events[i][1] + 1, i + 1);
        int use = events[i][2] + dfs(events, idx, k - 1, memo);

        int notUse = dfs(events, i + 1, k, memo);

        int res = Math.max(use, notUse);
        memo[i][k] = res;

        return res;
    }

    private int binarySearch(int[][] events, int i, int st) {

        if (st >= events.length) {
            return st;
        }

        int end = events.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (events[mid][0] < i) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }

        return events[st][0] >= i ? st : st + 1;
    }
}
