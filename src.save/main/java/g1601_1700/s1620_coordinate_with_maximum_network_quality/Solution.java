package g1601_1700.s1620_coordinate_with_maximum_network_quality;

// #Medium #Array #Enumeration #2022_06_13_Time_58_ms_(68.75%)_Space_43_MB_(43.75%)

public class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int[] res = new int[2];
        double maxQuality = 0;
        double quality;
        int finalX = 0;
        int finalY = 0;
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                quality = 0;
                for (int[] tower : towers) {
                    int x = tower[0] - i;
                    int y = tower[1] - j;
                    double dist = Math.sqrt((double) x * x + y * y);
                    if (dist <= radius) {
                        quality += Math.floor(tower[2] / (1 + dist));
                    }
                }
                if (maxQuality < quality) {
                    maxQuality = quality;
                    finalX = i;
                    finalY = j;
                }
            }
        }
        res[0] = finalX;
        res[1] = finalY;
        return res;
    }
}
