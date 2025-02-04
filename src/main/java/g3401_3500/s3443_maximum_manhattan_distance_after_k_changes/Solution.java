package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes;

// #Medium #String #Hash_Table #Math #Counting #2025_02_04_Time_50_(96.94%)_Space_45.89_(54.64%)

public class Solution {
    public int maxDistance(String s, int k) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c == 'N') {
                n++;
            } else if (c == 'S') {
                s++;
            } else if (c == 'E') {
                e++;
            } else if (c == 'W') {
                w++;
            }
            int hMax = Math.max(n, s);
            int vMax = Math.max(w, e);
            int hMin = Math.min(n, s);
            int vMin = Math.min(w, e);
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
