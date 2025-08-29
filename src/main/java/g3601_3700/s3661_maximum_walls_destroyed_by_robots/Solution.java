package g3601_3700.s3661_maximum_walls_destroyed_by_robots;

// #Hard #Weekly_Contest_464 #2025_08_29_Time_88_ms_(99.25%)_Space_68.62_MB_(40.75%)

import java.util.Arrays;

public class Solution {
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        if (robots.length == 1) {
            int a = 0;
            int b = 0;
            for (int wall : walls) {
                if (wall < robots[0] - distance[0] || wall > robots[0] + distance[0]) {
                    continue;
                }
                if (wall < robots[0]) {
                    a++;
                } else if (wall > robots[0]) {
                    b++;
                } else {
                    a++;
                    b++;
                }
            }
            return Math.max(a, b);
        }
        int[][] arr = new int[robots.length][];
        for (int i = 0; i < robots.length; i++) {
            arr[i] = new int[] {robots[i], distance[i]};
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        Arrays.sort(walls);
        int a = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        while (i < walls.length && walls[i] < arr[j][0] - arr[j][1]) {
            i++;
        }
        while (i < walls.length && walls[i] <= arr[j][0]) {
            a++;
            i++;
        }
        if (i > 0 && walls[i - 1] == arr[j][0]) {
            i--;
        }
        while (i < walls.length && walls[i] <= arr[j][0] + arr[j][1] && walls[i] < arr[j + 1][0]) {
            b++;
            i++;
        }
        j++;
        while (j < arr.length) {
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
                    j < arr.length - 1
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
            j++;
            int bNext = Math.max(a, b) + r;
            a = aNext;
            b = bNext;
        }
        return Math.max(a, b);
    }
}
