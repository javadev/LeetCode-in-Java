package g3601_3700.s3668_restore_finishing_order;

// #Easy #Weekly_Contest_465 #2025_08_31_Time_1_ms_(100.00%)_Space_45.15_MB_(49.19%)

public class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] rs = new int[friends.length];
        int index = 0;
        for (int k : order) {
            for (int friend : friends) {
                if (k == friend) {
                    rs[index] = k;
                    index++;
                    break;
                }
            }
        }
        return rs;
    }
}
