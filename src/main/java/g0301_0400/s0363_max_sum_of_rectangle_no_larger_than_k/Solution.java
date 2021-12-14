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
* Remember from previous approach, for each index we're trying to find an old prefix sum which is just greater than or equal to current prefix sum - k.
* So we can iterate over right subarray and for each index j, keep incrementing the pointer
* in left array i (initialized to start index) till that situation is false (or basically prefix[i] < prefix[j] - k).
* This way, we can compute the result for all cross subarrays (i.e. i in left subarray and j in right subarray) in linear time.
* After this, we do the standard merging part of merge sort.
*
*/

import java.util.Arrays;

public class Solution {
    private int[] M;

    private int merge(int[] A, int l, int m, int r, int k) {
        int res = Integer.MIN_VALUE;
        for (int j = m + 1, i = l; j <= r; j++) {
            while (i <= m && A[j] - A[i] > k) {
                i++;
            }
            if (i > m) {
                break;
            }
            res = Math.max(res, A[j] - A[i]);
            if (res == k) {
                return res;
            }
        }
        int i = l;
        int j = m + 1;
        int t = 0;
        while (i <= m && j <= r) {
            M[t++] = A[i] <= A[j] ? A[i++] : A[j++];
        }
        while (i <= m) {
            M[t++] = A[i++];
        }
        while (j <= r) {
            M[t++] = A[j++];
        }
        for (i = l; i <= r; i++) {
            A[i] = M[i - l];
        }
        return res;
    }

    private int mergeSort(int[] A, int l, int r, int k) {
        if (l == r) {
            return A[l] <= k ? A[l] : Integer.MIN_VALUE;
        }
        int m = l + ((r - l) >> 1);
        int res = mergeSort(A, l, m, k);
        if (res == k) {
            return res;
        }
        res = Math.max(res, mergeSort(A, m + 1, r, k));
        if (res == k) {
            return res;
        }
        return Math.max(res, merge(A, l, m, r, k));
    }

    private int maxSumSubarray(int[] A) {
        int min = 0, res = Integer.MIN_VALUE;
        for (int sum : A) {
            res = Math.max(res, sum - min);
            min = Math.min(min, sum);
        }
        return res;
    }

    private int maxSumSubarray(int[] A, int k) {
        int res = maxSumSubarray(A);
        if (res <= k) return res;
        return mergeSort(A.clone(), 0, A.length - 1, k);
    }

    public int maxSumSubMatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = m == 0 ? 0 : matrix[0].length;
        int res = Integer.MIN_VALUE;
        boolean groupingRows = true;
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
            groupingRows = false;
        }
        int[] sum = new int[n];
        this.M = new int[n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(sum, 0);
            for (int j = i; j < m; j++) {
                int pre = 0;
                if (groupingRows) {
                    for (int t = 0; t < n; t++) {
                        sum[t] += pre += matrix[j][t];
                    }
                } else {
                    for (int t = 0; t < n; t++) {
                        sum[t] += pre += matrix[t][j];
                    }
                }
                res = Math.max(res, maxSumSubarray(sum, k));
                if (res == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
