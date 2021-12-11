package g0301_0400.s0349_intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.List;

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k && !intersectionList.contains(j)) {
                    intersectionList.add(j);
                }
            }
        }
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) result[i] = intersectionList.get(i);
        return result;
    }
}
