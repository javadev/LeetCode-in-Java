package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array;

// #Easy #Array #Sorting #Heap_Priority_Queue #2022_03_29_Time_1_ms_(90.39%)_Space_43.6_MB_(29.18%)

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= first) {
                second = first;
                first = num;
            } else if (num >= second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }
}
