package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes;

// #Medium #String #Hash_Table #Math #Counting
// #2025_02_04_Time_50_ms_(96.94%)_Space_45.89_MB_(54.64%)

public class Solution {
    public int maxDistance(String s, int k) {
        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c == 'N') {
                north++;
            } else if (c == 'S') {
                south++;
            } else if (c == 'E') {
                east++;
            } else if (c == 'W') {
                west++;
            }
            int hMax = Math.max(north, south);
            int vMax = Math.max(west, east);
            int hMin = Math.min(north, south);
            int vMin = Math.min(west, east);
            if (hMin + vMin >= k) {
                int curr = hMax + vMax + k - (hMin + vMin - k);
                result = Math.max(result, curr);
            } else {
                int curr = hMax + vMax + hMin + vMin;
                result = Math.max(result, curr);
            }
        }
        return result;
    }
}
