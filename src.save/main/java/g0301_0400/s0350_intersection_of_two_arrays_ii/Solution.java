package g0301_0400.s0350_intersection_of_two_arrays_ii;

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers #Data_Structure_I_Day_3_Array
// #Binary_Search_I_Day_10 #2022_07_11_Time_4_ms_(69.62%)_Space_42.3_MB_(92.20%)

import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // First sort the array
        Arrays.sort(nums1);
        // Similar this one as well
        Arrays.sort(nums2);
        // "i" will point at nums1
        int i = 0;
        // "j" will point at nums2
        int j = 0;
        // "k" will point at nums1 and helps in getting the intersection answer;
        int k = 0;
        // Loop will run until "i" & "j" doesn't reach the array boundary;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // Check if nums1 value is less then nums2 value;
                // Increment "i"
                i++;
            } else if (nums1[i] > nums2[j]) {
                // Check if nums2 value is less then nums1 value;
                // Increment "j"
                j++;
            } else {
                // Check if nums1 value is equals to nums2 value;
                // Dump into nums1 and increment k, increment i & increment j as well;
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        // Only return nums1 0th index to kth index value, because that's will be our intersection;
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
