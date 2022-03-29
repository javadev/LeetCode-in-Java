package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array;

// #Easy #Array #Sorting #Heap_Priority_Queue #2022_03_29_Time_8_ms_(8.77%)_Space_41.7_MB_(92.82%)

public class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int product = (nums[i] - 1) * (nums[j] - 1);
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        return maxProduct;
    }
}
