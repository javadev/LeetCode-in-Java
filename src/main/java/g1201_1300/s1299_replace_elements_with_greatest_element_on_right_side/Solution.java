package g1201_1300.s1299_replace_elements_with_greatest_element_on_right_side;

// #Easy #Array #2022_03_10_Time_1_ms_(99.82%)_Space_54.3_MB_(34.76%)

public class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}
