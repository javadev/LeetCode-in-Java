package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2022_05_03_Time_7_ms_(86.67%)_Space_43.6_MB_(73.33%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, Integer> MAP = new HashMap<>();

    public int maxHappyGroups(int batchSize, int[] groups) {
        int[] count = new int[batchSize];
        int res = 0;
        int remGroup = 0;
        for (int group : groups) {
            int g = group % batchSize;
            if (g == 0) {
                res++;
            } else if (count[batchSize - g] > 0) {
                remGroup--;
                res++;
                count[batchSize - g]--;
            } else {
                count[g]++;
                remGroup++;
            }
        }
        res += dfs(0, remGroup, count, batchSize);
        return res;
    }

    private int dfs(int curr, int remain, int[] count, int batch) {
        if (remain == 0) {
            return 0;
        }
        int res = 0;
        String s = Arrays.toString(count);
        if (MAP.containsKey(s)) {
            return MAP.get(s);
        }
        if (curr == 0) {
            res++;
            curr = batch;
        }
        int val = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            count[i]--;
            val = Math.max(val, dfs((curr - i + batch) % batch, remain - 1, count, batch));
            count[i]++;
        }
        res += val;
        MAP.put(s, res);
        return res;
    }
}
