package g0701_0800.s0780_reaching_points;

// #Hard #Math

public class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx > ty) {
                if (ty == sy) {
                    // ty==sy
                    return (tx - sx) % sy == 0;
                } else { // ty > sy
                    tx %= ty;
                }
            } else if (sx == tx) {
                // ty >= tx
                return (ty - sy) % sx == 0;
            } else {
                // (tx > sx)
                ty %= tx;
            }
        }
        return false;
    }
}
