package g1301_1400.s1385_find_the_distance_value_between_two_arrays;

// #Easy #Array #Sorting #Binary_Search #Two_Pointers #Binary_Search_I_Day_3
// #2022_03_21_Time_5_ms_(65.78%)_Space_44.6_MB_(49.02%)

public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int k : arr1) {
            int j = 0;
            for (; j < arr2.length; j++) {
                if (Math.abs(k - arr2[j]) <= d) {
                    break;
                }
            }
            if (j == arr2.length) {
                count++;
            }
        }
        return count;
    }
}
