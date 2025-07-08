package g3401_3500.s3477_fruits_into_baskets_ii;

// #Easy #Array #Binary_Search #Simulation #Segment_Tree
// #2025_03_10_Time_1_ms_(100.00%)_Space_44.78_MB_(36.06%)

public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int currfruits;
        int count = 0;
        for (int fruit : fruits) {
            currfruits = fruit;
            for (int j = 0; j < n; j++) {
                if (baskets[j] >= currfruits) {
                    count++;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return n - count;
    }
}
