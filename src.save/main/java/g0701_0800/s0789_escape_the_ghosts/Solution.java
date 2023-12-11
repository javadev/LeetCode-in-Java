package g0701_0800.s0789_escape_the_ghosts;

// #Medium #Array #Math #2022_03_26_Time_0_ms_(100.00%)_Space_42.7_MB_(52.86%)

public class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int[] currPos = {0, 0};
        int selfDist = getDist(currPos, target);
        for (int[] ghost : ghosts) {
            int ghostDist = getDist(ghost, target);
            if (ghostDist <= selfDist) {
                return false;
            }
        }
        return true;
    }

    private int getDist(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}
