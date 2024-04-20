package g0001_0100.s0088_merge_sorted_array;

// #Easy #Top_Interview_Questions #Array #Sorting #Two_Pointers #Data_Structure_I_Day_2_Array
// #2022_06_20_Time_0_ms_(100.00%)_Space_42.7_MB_(55.70%)

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = nums1.length - 1;
        int p2 = n - 1;
        while (p2 >= 0) {
            if (i >= 0 && nums1[i] > nums2[p2]) {
                nums1[j--] = nums1[i--];
            } else {
                nums1[j--] = nums2[p2--];
            }
        }
    }
}
