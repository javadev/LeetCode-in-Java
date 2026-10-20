package g3901_4000.s3963_create_grid_with_exactly_one_path;

// #Easy #Mid_Level #Biweekly_Contest_185 #2026_10_20_Time_2_ms_(92.91%)_Space_45.85_MB_(97.87%)

public class Solution {
    public String[] createGrid(int m, int n) {
        var res = new String[m];
        var sb = new StringBuilder();
        sb.repeat(".", Math.max(0, n));
        res[0] = sb.toString();
        sb = new StringBuilder();
        sb.repeat("#", Math.max(0, n - 1));
        sb.append(".");
        for (var i = 1; i < m; i++) {
            res[i] = sb.toString();
        }
        return res;
    }
}
