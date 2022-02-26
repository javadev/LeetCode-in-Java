package g1001_1100.s1024_video_stitching;

// #Medium #Array #Dynamic_Programming #Greedy #2022_02_26_Time_1_ms_(88.78%)_Space_42.3_MB_(11.00%)

import java.util.Arrays;

public class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int count = 0;
        int covered = 0;
        for (int i = 0, start = 0; start < time; count++, start = covered) {
            for (; i < clips.length && clips[i][0] <= start; i++) {
                covered = Math.max(covered, clips[i][1]);
            }
            if (start == covered) {
                return -1;
            }
        }
        return count;
    }
}
