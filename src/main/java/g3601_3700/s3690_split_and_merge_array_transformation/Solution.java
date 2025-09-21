package g3601_3700.s3690_split_and_merge_array_transformation;

// #Medium #Weekly_Contest_468 #2025_09_21_Time_854_ms_(100.00%)_Space_45.28_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int minSplitMerge(int[] nums1, int[] nums2) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(nums1);
        Set<String> set = new HashSet<>();
        set.add(Arrays.toString(nums1));
        int level = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 1; i <= size; i++) {
                int[] node = que.poll();
                if (equals(node, nums2)) {
                    return level;
                }
                int n = Objects.requireNonNull(node).length;
                for (int l = 0; l < n; l++) {
                    for (int r = l; r < n; r++) {
                        int[] a = generate(node, l, r, 0);
                        int[] b = generate(node, l, r, 1);
                        for (int x = 0; x <= b.length; x++) {
                            int[] newArr = generate(a, b, x);
                            String s = Arrays.toString(newArr);
                            if (!set.contains(s)) {
                                set.add(s);
                                que.offer(newArr);
                            }
                        }
                    }
                }
            }
            level++;
        }
        return level;
    }

    private int[] generate(int[] a, int[] b, int index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            arr.add(b[i]);
        }
        for (int i : a) {
            arr.add(i);
        }
        for (int i = index; i < b.length; i++) {
            arr.add(b[i]);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] generate(int[] arr, int l, int r, int status) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (status == 0) {
                if (l <= i && i <= r) {
                    temp.add(arr[i]);
                }
            } else {
                if (i < l || r < i) {
                    temp.add(arr[i]);
                }
            }
        }
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean equals(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
