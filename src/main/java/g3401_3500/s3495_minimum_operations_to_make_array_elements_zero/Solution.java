package g3401_3500.s3495_minimum_operations_to_make_array_elements_zero;

// #Hard #2025_03_23_Time_9_ms_(100.00%)_Space_101.25_MB_(65.40%)

public class Solution {
    public long minOperations(int[][] queries) {
        long result = 0;
        for (int[] query : queries) {
            long v = 4;
            long req = 1;
            long totalReq = 0;
            while (query[0] >= v) {
                v *= 4;
                req++;
            }
            long group;
            if (query[1] < v) {
                group = query[1] - query[0] + 1;
                totalReq += group * req;
                result += (totalReq + 1) / 2;
                continue;
            }
            group = v - query[0];
            totalReq += group * req;
            long bottom = v;
            while (true) {
                v *= 4;
                req++;
                if (query[1] < v) {
                    group = query[1] - bottom + 1;
                    totalReq += group * req;
                    break;
                }
                group = v - bottom;
                totalReq += group * req;
                bottom = v;
            }
            result += (totalReq + 1) / 2;
        }
        return result;
    }
}
