package g0001_0100.s0088_merge_sorted_array;

// #Easy #Top_Interview_Questions #Array #Sorting #Two_Pointers #Data_Structure_I_Day_2_Array
// #Top_Interview_150_Array/String #2025_03_05_Time_0_ms_(100.00%)_Space_42.40_MB_(26.50%)

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
