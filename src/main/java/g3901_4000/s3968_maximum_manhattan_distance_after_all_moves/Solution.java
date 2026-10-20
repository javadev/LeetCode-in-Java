package g3901_4000.s3968_maximum_manhattan_distance_after_all_moves;

// #Medium #String #Math #Counting #Senior #Weekly_Contest_507
// #2026_10_20_Time_7_ms_(99.64%)_Space_47.68_MB_(80.65%)

public class Solution {
    public int maxDistance(String s) {
        int[] d = new int[96];
        for (char c : s.toCharArray()) {
            d[c]++;
        }
        return Math.abs(d['U'] - d['D']) + Math.abs(d['L'] - d['R']) + d['_'];
    }
}
