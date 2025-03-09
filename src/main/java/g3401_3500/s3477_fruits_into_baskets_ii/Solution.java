package g3401_3500.s3477_fruits_into_baskets_ii;

// #Easy #2025_03_09_Time_2_ms_(100.00%)_Space_45.04_MB_(100.00%)

public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int ct = 0;
        boolean[] used = new boolean[n];
        for (int fruit : fruits) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (fruit <= baskets[i] && !used[i]) {
                    used[i] = true;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ct++;
            }
        }
        return ct;
    }
}
