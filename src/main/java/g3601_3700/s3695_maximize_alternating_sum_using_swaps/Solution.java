package g3601_3700.s3695_maximize_alternating_sum_using_swaps;

// #Hard #Biweekly_Contest_166 #2025_09_28_Time_27_ms_(99.82%)_Space_106.96_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int[] root;

    public long maxAlternatingSum(int[] nums, int[][] swaps) {
        int n = nums.length;
        root = new int[n];
        List<Integer>[] list = new ArrayList[n];
        int[] oddCount = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
            list[i] = new ArrayList<>();
        }
        for (int[] s : swaps) {
            union(s[0], s[1]);
        }
        for (int i = 0; i < n; i++) {
            int r = findRoot(i);
            list[r].add(nums[i]);
            if (i % 2 == 1) {
                oddCount[r]++;
            }
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            int r = root[i];
            if (r != i) {
                continue;
            }
            list[i].sort((a, b) -> a - b);
            for (int j = 0; j < list[i].size(); j++) {
                result += list[i].get(j) * (j < oddCount[r] ? -1 : 1);
            }
        }
        return result;
    }

    private void union(int a, int b) {
        a = findRoot(a);
        b = findRoot(b);
        if (a == b) {
            return;
        }
        if (a < b) {
            root[b] = a;
        } else {
            root[a] = b;
        }
    }

    private int findRoot(int a) {
        if (a == root[a]) {
            return a;
        }
        root[a] = findRoot(root[a]);
        return root[a];
    }
}
