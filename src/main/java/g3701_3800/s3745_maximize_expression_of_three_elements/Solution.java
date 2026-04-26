package g3701_3800.s3745_maximize_expression_of_three_elements;

// #Easy #Array #Sorting #Greedy #Enumeration #Mid_Level #Weekly_Contest_476
// #2026_04_26_Time_1_ms_(99.84%)_Space_45.12_MB_(68.56%)

public class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max1 + max2 - min;
    }
}
