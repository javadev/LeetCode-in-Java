package g0301_0400.s0321_create_maximum_number;

// #Hard #Greedy #Stack #Monotonic_Stack #2022_07_09_Time_11_ms_(93.20%)_Space_46.2_MB_(80.95%)

public class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if (k == 0) {
            return new int[0];
        }
        int[] maxSubNums1 = new int[k];
        int[] maxSubNums2 = new int[k];
        int[] res = new int[k];
        // select l elements from nums1
        for (int l = 0; l <= Math.min(k, nums1.length); l++) {
            if (l + nums2.length < k) {
                continue;
            }
            // create maximum number for each array
            // nums1: l elements; nums2: k - l elements
            maxSubArray(nums1, maxSubNums1, l);
            maxSubArray(nums2, maxSubNums2, k - l);
            // merge the two maximum numbers
            // if get a larger number than res, update res
            res = merge(maxSubNums1, maxSubNums2, l, k - l, res);
        }
        return res;
    }

    private void maxSubArray(int[] nums, int[] maxSub, int size) {
        if (size == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j > 0 && nums.length - i + j > size && nums[i] > maxSub[j - 1]) {
                j--;
            }
            if (j < size) {
                maxSub[j++] = nums[i];
            }
        }
    }

    private int[] merge(int[] maxSub1, int[] maxSub2, int size1, int size2, int[] res) {
        int[] merge = new int[res.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        boolean equal = true;
        while (i < size1 || j < size2) {
            if (j >= size2) {
                merge[idx] = maxSub1[i++];
            } else if (i >= size1) {
                merge[idx] = maxSub2[j++];
            } else {
                int ii = i;
                int jj = j;
                while (ii < size1 && jj < size2 && maxSub1[ii] == maxSub2[jj]) {
                    ii++;
                    jj++;
                }
                if (ii < size1 && jj < size2) {
                    if (maxSub1[ii] > maxSub2[jj]) {
                        merge[idx] = maxSub1[i++];
                    } else {
                        merge[idx] = maxSub2[j++];
                    }
                } else if (jj == size2) {
                    merge[idx] = maxSub1[i++];
                } else {
                    // ii == size1
                    merge[idx] = maxSub2[j++];
                }
            }
            // break if we already know merge must be < res
            if (merge[idx] > res[idx]) {
                equal = false;
            } else if (equal && merge[idx] < res[idx]) {
                break;
            }
            idx++;
        }
        // if get a larger number than res, update res
        int k = res.length;
        if (i == size1 && j == size2 && !equal) {
            return merge;
        }
        if (equal && merge[k - 1] > res[k - 1]) {
            return merge;
        }
        return res;
    }
}
