package g3401_3500.s3479_fruits_into_baskets_iii;

// #Medium #Array #Binary_Search #Ordered_Set #Segment_Tree
// #2025_03_10_Time_655_ms_(100.00%)_Space_65.58_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unp = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int basket : baskets) {
            list.add(basket);
            max = Math.max(max, basket);
        }
        for (int fruit : fruits) {
            if (fruit > max) {
                unp++;
                continue;
            }
            boolean placed = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= fruit) {
                    list.remove(j);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unp++;
            }
        }
        return unp;
    }
}
