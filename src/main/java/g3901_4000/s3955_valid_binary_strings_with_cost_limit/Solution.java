package g3901_4000.s3955_valid_binary_strings_with_cost_limit;

// #Medium #String #Bit_Manipulation #Backtracking #Enumeration #Senior #Weekly_Contest_505
// #2026_10_20_Time_5_ms_(96.05%)_Space_46.65_MB_(99.60%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> result;
    private int n;
    private int k;

    public List<String> generateValidStrings(int n, int k) {
        this.result = new ArrayList<>();
        this.n = n;
        this.k = k;
        char[] path = new char[n];
        dfs(0, 0, path);
        return result;
    }

    private void dfs(int index, int cost, char[] path) {
        if (index == n) {
            result.add(new String(path));
            return;
        }
        path[index] = '0';
        dfs(index + 1, cost, path);
        boolean canPlaceOne = (index == 0 || path[index - 1] != '1') && (cost + index <= k);
        if (canPlaceOne) {
            path[index] = '1';
            dfs(index + 1, cost + index, path);
        }
    }
}
