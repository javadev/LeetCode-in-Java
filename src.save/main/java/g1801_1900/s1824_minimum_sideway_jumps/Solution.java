package g1801_1900.s1824_minimum_sideway_jumps;

// #Medium #Array #Dynamic_Programming #Greedy
// #2022_05_06_Time_17_ms_(96.34%)_Space_217.7_MB_(56.10%)

public class Solution {
    public int minSideJumps(int[] obstacles) {
        int sideJumps = 0;
        int currLane = 2;
        int i = 0;
        while (i < obstacles.length - 1) {
            if (obstacles[i + 1] == currLane) {
                if (obstacles[i] != 0) {
                    currLane = getNextLane(obstacles[i], obstacles[i + 1]);
                } else {
                    int j = i + 2;
                    while (j < obstacles.length
                            && (obstacles[j] == 0 || obstacles[j] == obstacles[i + 1])) {
                        j++;
                    }
                    if (j < obstacles.length) {
                        currLane = getNextLane(obstacles[i + 1], obstacles[j]);
                    } else {
                        i = obstacles.length - 1;
                    }
                }
                sideJumps++;
            }
            i++;
        }
        return sideJumps;
    }

    private int getNextLane(int nextObstacle, int nextNextObstacle) {
        if ((nextObstacle == 2 && nextNextObstacle == 3)
                || (nextObstacle == 3 && nextNextObstacle == 2)) {
            return 1;
        }
        if ((nextObstacle == 1 && nextNextObstacle == 3)
                || (nextObstacle == 3 && nextNextObstacle == 1)) {
            return 2;
        } else {
            return 3;
        }
    }
}
