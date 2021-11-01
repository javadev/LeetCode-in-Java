package s0004_median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        double f;
        for (int j : nums1) {
            l.add(j);
        }
        for (int i : nums2) {
            l.add(i);
        }
        Collections.sort(l);
        int k = l.size();
        if (k % 2 == 0) {
            f = (double) ((l.get(k / 2 - 1)) + (l.get(k / 2))) / 2;
        } else {
            f = l.get(((k + 1) / 2) - 1);
        }
        return f;
    }
}
