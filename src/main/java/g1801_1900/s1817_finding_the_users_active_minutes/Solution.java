package g1801_1900.s1817_finding_the_users_active_minutes;

// #Medium #Array #Hash_Table #2022_05_03_Time_16_ms_(91.64%)_Space_121.1_MB_(48.79%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        if (logs.length == 1) {
            int[] res = new int[k];
            res[0] = 1;
            return res;
        }
        Arrays.sort(logs, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
        int[] result = new int[k];
        int start = 1;
        int prevUser = logs[0][0];
        int prevMin = logs[0][1];
        int count = 1;
        while (true) {
            while (start < logs.length && prevUser == logs[start][0]) {
                if (prevMin != logs[start][1]) {
                    count++;
                }
                prevMin = logs[start][1];
                start++;
            }
            result[count - 1]++;
            if (start >= logs.length) {
                break;
            }
            count = 1;
            prevUser = logs[start][0];
            prevMin = logs[start][1];
        }
        return result;
    }
}
