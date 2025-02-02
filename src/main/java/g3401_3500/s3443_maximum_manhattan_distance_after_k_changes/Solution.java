package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes;

// #Medium #2025_02_02_Time_189_(_%)_Space_45.65_(100.00%)

public class Solution {
    public int maxDistance(String s, int k) {
        int ans = 0;
        char[][] dir = new char[][] {{'N', 'E'}, {'N', 'W'}, {'S', 'E'}, {'S', 'W'}};
        for (char[] d : dir) {
            int curr = 0;
            int t = k;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == d[0] || s.charAt(i) == d[1]) {
                    if (t > 0) {
                        t--;
                        curr++;
                    } else {
                        curr--;
                    }
                } else {
                    curr++;
                }
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }
}
