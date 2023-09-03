package g0801_0900.s0870_advantage_shuffle;

// #Medium #Array #Sorting #Greedy #2022_03_28_Time_188_ms_(28.01%)_Space_116.9_MB_(5.12%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("java:S5413")
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
        Deque<Integer> sta = new ArrayDeque<>();
        for (int i = 0; i < l && !pque.isEmpty(); i++) {
            List<Integer> p = map.getOrDefault(n[i], new ArrayList<>());
            int x = pque.poll();
            if (x > n[i]) {
                p.add(x);
                map.put(n[i], p);
            } else {
                while (x <= n[i] && !pque.isEmpty()) {
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
            int t;
            if (!p.isEmpty()) {
                t = p.get(0);
                p.remove(0);
                map.put(nums2[i], p);
            } else {
                t = sta.pop();
            }
            nums1[i] = t;
        }
        return nums1;
    }
}
