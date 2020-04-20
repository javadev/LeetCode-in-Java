package s0004.median.of.two.sorted.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<Integer>();
        double f;
        for(int i=0;i<nums1.length;i++) 
            l.add(nums1[i]);
        for(int j=0;j<nums2.length;j++)
               l.add(nums2[j]);
        Collections.sort(l);
        int k=l.size();
        if(k%2==0)
           f=(double)((l.get(k/2-1))+(l.get(k/2)))/2;
        else 
            f = l.get(((k + 1) / 2)-1);
        return f;
    }
}
