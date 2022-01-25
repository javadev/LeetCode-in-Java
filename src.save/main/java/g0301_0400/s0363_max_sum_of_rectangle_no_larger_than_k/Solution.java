package g0301_0400.s0363_max_sum_of_rectangle_no_larger_than_k;

// #Hard #Array #Dynamic_Programming #Binary_Search #Matrix #Ordered_Set

/*
 *
 * Basic idea is the same as previous approach but we solve the problem in Step 2 differently.
 * Here we leverage divide and conquer technique. Basically we perform merge sort on prefix sum values and
 * calculate result during merge step.
 * One might remember the idea of using merge sort to count inversions in an array. This is very similar.
 * So how exactly do we compute result during merge step?
 * Suppose we are merging left prefix subarray and right prefix subarray.
 * Remember from previous approach, for each index we're trying to find an old prefix sum which is just greater than or
 * equal to current prefix sum - k.
 * So we can iterate over right subarray and for each index j, keep incrementing the pointer
 * in left array i (initialized to start index) till that situation is false (or basically prefix[i] < prefix[j] - k).
 * This way, we can compute the result for all cross subarrays (i.e. i in left subarray and j in right subarray)
 * in linear time.
 * After this, we do the standard merging part of merge sort.
 *
 */

import java.util.Arrays;

public class Solution {
    private int[] m;

    private int merge(int[] a, int l, int m, int r, int k) {
        int res = Integer.MIN_VALUE;
        for (int j = m + 1; j <= r; j++) {
            int i = l;
            while (i <= m && a[j] - a[i] > k) {
                i++;
            }
            if (i > m) {
                break;
            }
            res = Math.max(res, a[j] - a[i]);
            if (res == k) {
                return res;
            }
        }
        int i = l;
        int j = m + 1;
        int t = 0;
        while (i <= m && j <= r) {
            this.m[t++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= m) {
            this.m[t++] = a[i++];
        }
        while (j <= r) {
            this.m[t++] = a[j++];
        }
        for (i = l; i <= r; i++) {
            a[i] = this.m[i - l];
        }
        return res;
    }

    private int mergeSort(int[] a, int l, int r, int k) {
        if (l == r) {
            return a[l] <= k ? a[l] : Integer.MIN_VALUE;
        }
        int localM = l + ((r - l) >> 1);
        int res = mergeSort(a, l, localM, k);
        if (res == k) {
            return res;
        }
        res = Math.max(res, mergeSort(a, localM + 1, r, k));
        if (res == k) {
            return res;
        }
        return Math.max(res, merge(a, l, localM, r, k));
    }

    private int maxSumSubArray(int[] a) {
        int min = 0;
        int res = Integer.MIN_VALUE;
        for (int sum : a) {
            res = Math.max(res, sum - min);
            min = Math.min(min, sum);
        }
        return res;
    }

    private int maxSumSubArray(int[] a, int k) {
        int res = maxSumSubArray(a);
        if (res <= k) {
            return res;
        }
        return mergeSort(a.clone(), 0, a.length - 1, k);
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int localM = matrix.length;
        int localN = localM == 0 ? 0 : matrix[0].length;
        int res = Integer.MIN_VALUE;
        boolean groupingRows = true;
        if (localM > localN) {
            int temp = localM;
            localM = localN;
            localN = temp;
            groupingRows = false;
        }
        int[] sum = new int[localN];
        this.m = new int[localN];
        for (int i = 0; i < localM; i++) {
            Arrays.fill(sum, 0);
            for (int j = i; j < localM; j++) {
                int pre = 0;
                if (groupingRows) {
                    for (int t = 0; t < localN; t++) {
                        pre += matrix[j][t];
                        sum[t] += pre;
                    }
                } else {
                    for (int t = 0; t < localN; t++) {
                        pre += matrix[t][j];
                        sum[t] += pre;
                    }
                }
                res = Math.max(res, maxSumSubArray(sum, k));
                if (res == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
