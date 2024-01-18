package g1401_1500.s1402_reducing_dishes;

// #Hard #Array #Dynamic_Programming #Sorting #Greedy
// #2022_03_25_Time_3_ms_(66.20%)_Space_41.3_MB_(80.80%)

import java.util.Arrays;

public class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0;
        int mulSum = 0;
        for (int i = 0; i < satisfaction.length; i++) {
            sum += satisfaction[i];
            mulSum += (i + 1) * satisfaction[i];
        }
        int maxVal = Math.max(0, mulSum);
        for (int j : satisfaction) {
            mulSum -= sum;
            sum -= j;
            maxVal = Math.max(maxVal, mulSum);
        }
        return maxVal;
    }
}
