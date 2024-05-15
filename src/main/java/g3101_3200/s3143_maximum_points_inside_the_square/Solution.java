package g3101_3200.s3143_maximum_points_inside_the_square;

// #Medium #Array #String #Hash_Table #Sorting #Binary_Search
// #2024_05_15_Time_2_ms_(100.00%)_Space_100.1_MB_(61.27%)

import java.util.Arrays;

public class Solution {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] tags = new int[26];
        Arrays.fill(tags, Integer.MAX_VALUE);
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int dist = Math.max(Math.abs(points[i][0]), Math.abs(points[i][1]));
            char c = s.charAt(i);
            if (tags[c - 'a'] == Integer.MAX_VALUE) {
                tags[c - 'a'] = dist;
            } else if (dist < tags[c - 'a']) {
                secondMin = Math.min(secondMin, tags[c - 'a']);
                tags[c - 'a'] = dist;
            } else {
                secondMin = Math.min(secondMin, dist);
            }
        }
        int count = 0;
        for (int dist : tags) {
            if (dist < secondMin) {
                count++;
            }
        }
        return count;
    }
}
