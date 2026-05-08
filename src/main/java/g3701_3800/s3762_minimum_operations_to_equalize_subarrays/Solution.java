package g3701_3800.s3762_minimum_operations_to_equalize_subarrays;

// #Hard #Array #Math #Binary_Search #Segment_Tree #Weekly_Contest_478 #Principal
// #2026_05_08_Time_528_ms_(100.00%)_Space_267.97_MB_(76.92%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static class MNode {
        int l;
        int r;
        int[] vals;
        long[] pref;
        MNode left;
        MNode right;

        MNode(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    private static class Group {
        int[] pos;
        int[] val;
        long[] prefPos;
        MNode root;
        int minv;
        int maxv;
    }

    private static int lowerBound(int[] a, int x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private int upperBound(int[] a, int x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] > x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private MNode buildMerge(int[] arr, int l, int r) {
        MNode node = new MNode(l, r);
        if (l == r) {
            node.vals = new int[] {arr[l]};
            node.pref = new long[] {arr[l]};
            return node;
        }
        int m = (l + r) >>> 1;
        node.left = buildMerge(arr, l, m);
        node.right = buildMerge(arr, m + 1, r);
        int[] a = node.left.vals;
        int[] b = node.right.vals;
        int na = a.length;
        int nb = b.length;
        int[] c = new int[na + nb];
        long[] pref = new long[na + nb];
        int ia = 0;
        int ib = 0;
        int k = 0;
        while (ia < na && ib < nb) {
            if (a[ia] <= b[ib]) {
                c[k++] = a[ia++];
            } else {
                c[k++] = b[ib++];
            }
        }
        while (ia < na) {
            c[k++] = a[ia++];
        }
        while (ib < nb) {
            c[k++] = b[ib++];
        }
        pref[0] = c[0];
        for (int i = 1; i < c.length; i++) {
            pref[i] = pref[i - 1] + c[i];
        }
        node.vals = c;
        node.pref = pref;
        return node;
    }

    private int countLE(MNode node, int ql, int qr, int x) {
        if (node == null || ql > node.r || qr < node.l) {
            return 0;
        }
        if (ql <= node.l && node.r <= qr) {
            int idx = upperBound(node.vals, x) - 1;
            return idx < 0 ? 0 : idx + 1;
        }
        return countLE(node.left, ql, qr, x) + countLE(node.right, ql, qr, x);
    }

    private long sumLE(MNode node, int ql, int qr, int x) {
        if (node == null || ql > node.r || qr < node.l) {
            return 0L;
        }
        if (ql <= node.l && node.r <= qr) {
            int idx = upperBound(node.vals, x) - 1;
            return idx < 0 ? 0L : node.pref[idx];
        }
        return sumLE(node.left, ql, qr, x) + sumLE(node.right, ql, qr, x);
    }

    public long[] minOperations(int[] nums, int k, int[][] queries) {
        Map<Integer, Group> groupHashMap = buildGroups(nums, k);
        long[] ans = new long[queries.length];
        for (int qi = 0; qi < queries.length; qi++) {
            ans[qi] = processQuery(nums, queries[qi], groupHashMap, k);
        }
        return ans;
    }

    private Map<Integer, Group> buildGroups(int[] nums, int k) {
        Map<Integer, ArrayList<int[]>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i] % k;
            int value = nums[i] / k;
            map.computeIfAbsent(rem, z -> new ArrayList<>()).add(new int[] {i, value});
        }
        Map<Integer, Group> groupHashMap = new HashMap<>();
        for (Map.Entry<Integer, ArrayList<int[]>> entry : map.entrySet()) {
            groupHashMap.put(entry.getKey(), createGroup(entry.getValue()));
        }
        return groupHashMap;
    }

    private Group createGroup(ArrayList<int[]> arr) {
        arr.sort(Comparator.comparingInt(a -> a[0]));
        int size = arr.size();
        int[] pos = new int[size];
        int[] val = new int[size];
        long[] prefPos = new long[size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            pos[i] = arr.get(i)[0];
            val[i] = arr.get(i)[1];
            min = Math.min(min, val[i]);
            max = Math.max(max, val[i]);
            prefPos[i] = i == 0 ? val[i] : prefPos[i - 1] + val[i];
        }
        Group group = new Group();
        group.pos = pos;
        group.val = val;
        group.prefPos = prefPos;
        group.minv = min;
        group.maxv = max;
        if (size > 0) {
            group.root = buildMerge(val, 0, size - 1);
        }
        return group;
    }

    private long processQuery(int[] nums, int[] query, Map<Integer, Group> groupHashMap, int k) {
        int left = query[0];
        int right = query[1];
        int rem = nums[left] % k;
        Group group = groupHashMap.get(rem);
        if (group == null) {
            return -1;
        }
        int l = lowerBound(group.pos, left);
        int r = upperBound(group.pos, right) - 1;
        if (!isValidRange(left, right, l, r)) {
            return -1;
        }
        return calculateOperations(group, l, r);
    }

    private boolean isValidRange(int left, int right, int l, int r) {
        return l <= r && (r - l + 1 == right - left + 1);
    }

    private long calculateOperations(Group group, int l, int r) {
        int count = r - l + 1;
        int median = findMedian(group, l, r, count);
        long leftCount = countLE(group.root, l, r, median);
        long leftSum = sumLE(group.root, l, r, median);
        long total = group.prefPos[r] - (l == 0 ? 0L : group.prefPos[l - 1]);
        long rightSum = total - leftSum;
        long rightCount = count - leftCount;
        return median * leftCount - leftSum + rightSum - median * rightCount;
    }

    private int findMedian(Group group, int l, int r, int count) {
        int need = (count + 1) / 2;
        int low = group.minv;
        int high = group.maxv;
        while (low < high) {
            int mid = low + ((high - low) >>> 1);
            int currentCount = countLE(group.root, l, r, mid);
            if (currentCount >= need) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
