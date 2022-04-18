package g1601_1700.s1620_coordinate_with_maximum_network_quality;

// #Medium #Array #Enumeration #2022_04_18_Time_111_ms_(7.14%)_Space_41_MB_(92.86%)

public class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int minX;
        int minY;
        int maxX;
        int maxY;

        minX = minY = Integer.MAX_VALUE;
        maxY = maxX = Integer.MIN_VALUE;

        if (towers.length == 1 && towers[0][2] != 0) {
            int[] arr = new int[2];
            arr[0] = towers[0][0];
            arr[1] = towers[0][1];
            return arr;
        } else if (towers.length == 1) {
            return new int[2];
        }

        for (int[] tower : towers) {
            minX = Math.min(minX, tower[0]);
            maxX = Math.max(maxX, tower[0]);

            minY = Math.min(minY, tower[0]);
            maxY = Math.max(maxY, tower[0]);
        }

        minX -= radius;
        maxX += radius;

        minY -= radius;
        maxY += radius;

        if (minX < 0)
            minX = 0;

        if (minY < 0)
            minY = 0;

        int maxQuality = Integer.MIN_VALUE;
        int[] ans = new int[2];
        int quality = 0;
        for (int i = minX; i <= maxX; i++)
            for (int j = minY; j <= maxY; j++) {
                quality = 0;
                for (int[] tower : towers) {
                    double dist = Math.sqrt(Math.pow((i - tower[0]), 2) +
                            Math.pow((j - tower[1]), 2));

                    if (dist <= (double) radius)
                        quality += (int) Math.floor(tower[2] / (1 + dist));
                }
                if (quality > maxQuality) {
                    maxQuality = quality;
                    ans[0] = i;
                    ans[1] = j;
                } else if (quality == maxQuality && i < ans[0]) {
                    ans[0] = i;
                    ans[1] = j;
                } else if (quality == maxQuality && i == ans[0] && j < ans[1]) {
                    ans[1] = j;
                }
            }

        return ans;
    }
}
