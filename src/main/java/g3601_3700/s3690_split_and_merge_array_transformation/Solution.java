package g3601_3700.s3690_split_and_merge_array_transformation;

// #Medium #Array #Hash_Table #Breadth_First_Search #Weekly_Contest_468
// #2025_09_25_Time_11_ms_(99.81%)_Space_45.46_MB_(45.98%)

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public int minSplitMerge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int id = 0;
        Map<Integer, Integer> map = new HashMap<>(n << 1);
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], id++);
            }
        }
        int source = 0;
        for (int x : nums1) {
            source = source * 6 + map.get(x);
        }
        int target = 0;
        for (int x : nums2) {
            target = target * 6 + map.get(x);
        }
        if (source == target) {
            return 0;
        }
        Deque<Integer> que = new LinkedList<>();
        que.add(source);
        int[] distances = new int[(int) Math.pow(6, n)];
        distances[source] = 1;
        while (!que.isEmpty()) {
            int x = que.poll();
            int[] cur = rev(x, n);
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    for (int k = -1; k < n; k++) {
                        if (k < i - 1) {
                            int[] ncur = new int[n];
                            int t1 = 0;
                            for (int t = 0; t <= k; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = i; t <= j; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = k + 1; t < i; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = j + 1; t < n; t++) {
                                ncur[t1++] = cur[t];
                            }
                            int t2 = hash(ncur);
                            if (distances[t2] == 0) {
                                distances[t2] = distances[x] + 1;
                                if (t2 == target) {
                                    return distances[x];
                                }
                                que.add(t2);
                            }
                        }
                        if (k > j) {
                            int[] ncur = new int[n];
                            int t1 = 0;
                            for (int t = 0; t < i; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = j + 1; t <= k; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = i; t <= j; t++) {
                                ncur[t1++] = cur[t];
                            }
                            for (int t = k + 1; t < n; t++) {
                                ncur[t1++] = cur[t];
                            }
                            int t2 = hash(ncur);
                            if (distances[t2] == 0) {
                                distances[t2] = distances[x] + 1;
                                if (t2 == target) {
                                    return distances[x];
                                }
                                que.add(t2);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private int hash(int[] nums) {
        int num = 0;
        for (int x : nums) {
            num = num * 6 + x;
        }
        return num;
    }

    private int[] rev(int x, int n) {
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = x % 6;
            x /= 6;
        }
        return digits;
    }
}
