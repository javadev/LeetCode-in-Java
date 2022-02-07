package g0801_0900.s0870_advantage_shuffle;

// #Medium #Array #Sorting #Greedy

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        for (int e : nums1) {
            pque.add(e);
        }
        int l = nums1.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] n = new int[l];
        System.arraycopy(nums2, 0, n, 0, l);
        Arrays.sort(n);
        Stack<Integer> sta = new Stack<>();
        for (int i = 0; i < l && pque.size() > 0; i++) {
            List<Integer> p = map.getOrDefault(n[i], new ArrayList<>());
            int x = pque.poll();
            if (x > n[i]) {
                p.add(x);
                map.put(n[i], p);
            } else {
                while (x <= n[i] && pque.size() > 0) {
                    sta.push(x);
                    x = pque.poll();
                }
                if (x > n[i]) {
                    p.add(x);
                    map.put(n[i], p);
                } else {
                    sta.push(x);
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            List<Integer> p = map.getOrDefault(nums2[i], new ArrayList<>());
            if (p.size() > 0) {
                int t = p.get(0);
                p.remove(0);
                map.put(nums2[i], p);
                nums1[i] = t;
            } else {
                int t = sta.pop();
                nums1[i] = t;
            }
        }
        return nums1;
    }
}
