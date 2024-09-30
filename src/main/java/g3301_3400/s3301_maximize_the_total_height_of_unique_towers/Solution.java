package g3301_3400.s3301_maximize_the_total_height_of_unique_towers;

// #Medium #2024_09_30_Time_49_ms_(100.00%)_Space_57.8_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        long result = maximumHeight[maximumHeight.length - 1];
        long previousHeight = maximumHeight[maximumHeight.length - 1];
        for (int i = maximumHeight.length - 2; i >= 0; i--) {
            if (previousHeight == 1) {
                return -1;
            }
            long height = maximumHeight[i];
            if (height >= previousHeight) {
                result = result + previousHeight - 1;
                previousHeight = previousHeight - 1;
            } else {
                result = result + height;
                previousHeight = height;
            }
        }
        return result;
    }
}
