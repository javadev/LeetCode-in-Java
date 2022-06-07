package g2101_2200.s2148_count_elements_with_strictly_smaller_and_greater_elements;

// #Easy #Array #Sorting #2022_06_07_Time_0_ms_(100.00%)_Space_40.6_MB_(88.75%)

public class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int minocr = 1;
        int maxocr = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
                minocr = 1;
            } else if (nums[i] == min) {
                minocr++;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxocr = 1;
            } else if (nums[i] == max) {
                maxocr++;
            }
        }
        return min == max ? 0 : nums.length - minocr - maxocr;
    }
}
