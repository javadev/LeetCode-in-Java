package g3601_3700.s3661_maximum_walls_destroyed_by_robots;

// #Hard #Weekly_Contest_464 #2025_08_29_Time_88_ms_(99.25%)_Space_68.62_MB_(40.75%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        if (robots.length == 1) {
            return handleSingleRobot(robots[0], distance[0], walls);
        }
        int[][] arr = buildRobotArray(robots, distance);
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(walls);
        return processMultipleRobots(arr, walls);
    }

    private int handleSingleRobot(int robot, int dist, int[] walls) {
        int left = 0;
        int right = 0;
        for (int wall : walls) {
            if (wall < robot - dist || wall > robot + dist) {
                continue;
            }
            if (wall < robot) {
                left++;
            } else if (wall > robot) {
                right++;
            } else {
                left++;
                right++;
            }
        }
        return Math.max(left, right);
    }

    private int[][] buildRobotArray(int[] robots, int[] distance) {
        int[][] arr = new int[robots.length][2];
        for (int i = 0; i < robots.length; i++) {
            arr[i][0] = robots[i];
            arr[i][1] = distance[i];
        }
        return arr;
    }

    private int processMultipleRobots(int[][] arr, int[] walls) {
        int a;
        int b;
        int i = 0;
        int j = 0;
        i = skipWallsBeforeRange(walls, i, arr[j][0] - arr[j][1]);
        a = countWallsUpToRobot(walls, i, arr[j][0]);
        i += a;
        if (i > 0 && walls[i - 1] == arr[j][0]) {
            i--;
        }
        b = countWallsInRange(walls, i, arr[j][0] + arr[j][1], arr[j + 1][0]);
        i += b;
        j++;
        while (j < arr.length) {
            int[] result = processRobotStep(arr, walls, j, i, a, b);
            a = result[0];
            b = result[1];
            i = result[2];
            j++;
        }
        return Math.max(a, b);
    }

    private int skipWallsBeforeRange(int[] walls, int i, int limit) {
        while (i < walls.length && walls[i] < limit) {
            i++;
        }
        return i;
    }

    private int countWallsUpToRobot(int[] walls, int i, int robotPos) {
        int count = 0;
        while (i + count < walls.length && walls[i + count] <= robotPos) {
            count++;
        }
        return count;
    }

    private int countWallsInRange(int[] walls, int i, int maxReach, int nextRobot) {
        int count = 0;
        while (i + count < walls.length
                && walls[i + count] <= maxReach
                && walls[i + count] < nextRobot) {
            count++;
        }
        return count;
    }

    private int[] processRobotStep(int[][] arr, int[] walls, int j, int i, int a, int b) {
        int l1 = 0;
        int k = i;
        while (k < walls.length && walls[k] < arr[j][0] - arr[j][1]) {
            k++;
        }
        while (k < walls.length && walls[k] <= arr[j][0]) {
            l1++;
            k++;
        }
        int nextI = k;
        int l2 = l1;
        k = i - 1;
        while (k >= 0 && walls[k] > arr[j - 1][0] && walls[k] >= arr[j][0] - arr[j][1]) {
            l2++;
            k--;
        }
        int aNext = Math.max(a + l2, b + l1);
        int r = 0;
        int lim =
                (j < arr.length - 1)
                        ? Math.min(arr[j + 1][0], arr[j][0] + arr[j][1] + 1)
                        : arr[j][0] + arr[j][1] + 1;
        if (nextI > 0 && walls[nextI - 1] == arr[j][0]) {
            i = nextI - 1;
        } else {
            i = nextI;
        }
        while (i < walls.length && walls[i] < lim) {
            r++;
            i++;
        }
        int bNext = Math.max(a, b) + r;
        return new int[] {aNext, bNext, i};
    }
}
