package g0701_0800.s0789_escape_the_ghosts;

// #Medium #Array #Math

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
