package g1201_1300.s1287_element_appearing_more_than_25_in_sorted_array;

// #Easy #Array #2022_03_11_Time_0_ms_(100.00%)_Space_46.7_MB_(65.15%)

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int quarter = arr.length / 4;
        for (int i = 0; i < arr.length - quarter; i++) {
            if (arr[i] == arr[i + quarter]) {
                return arr[i];
            }
        }
        return -1;
    }
}
