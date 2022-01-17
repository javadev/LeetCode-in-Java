package g0601_0700.s0658_find_k_closest_elements;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Heap_Priority_Queue

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0;
        int hi = arr.length - 1;
        List<Integer> ans = new ArrayList<>();
        while (hi - lo > k - 1) {
            if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) lo++;
            else hi--;
        }

        for (int i = lo; i <= hi; i++) ans.add(arr[i]);

        return ans;
    }
}
