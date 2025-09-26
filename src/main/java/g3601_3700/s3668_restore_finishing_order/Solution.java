package g3601_3700.s3668_restore_finishing_order;

// #Easy #Array #Hash_Table #Weekly_Contest_465
// #2025_09_26_Time_1_ms_(100.00%)_Space_44.90_MB_(92.68%)

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
