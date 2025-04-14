package g3501_3600.s3516_find_closest_person;

// #Easy #Math #2025_04_14_Time_0_ms_(100.00%)_Space_41.20_MB_(_%)

public class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(z - x);
        int d2 = Math.abs(z - y);
        if (d1 == d2) {
            return 0;
        } else if (d1 < d2) {
            return 1;
        } else {
            return 2;
        }
    }
}
