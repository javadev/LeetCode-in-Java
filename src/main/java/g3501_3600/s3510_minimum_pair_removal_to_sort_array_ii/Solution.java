package g3501_3600.s3510_minimum_pair_removal_to_sort_array_ii;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Simulation #Linked_List #Ordered_Set
// #Doubly_Linked_List #2025_04_29_Time_274_ms_(98.94%)_Space_70.73_MB_(69.15%)

import java.util.Arrays;

public class Solution {
    public int minimumPairRemoval(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int size = (int) Math.pow(2, Math.ceil(Math.log(nums.length - 1) / Math.log(2)));
        long[] segment = new long[size * 2 - 1];
        Arrays.fill(segment, Long.MAX_VALUE);
        int[] lefts = new int[size * 2 - 1];
        int[] rights = new int[size * 2 - 1];
        long[] sums = new long[nums.length];
        Arrays.fill(sums, Long.MAX_VALUE / 2);
        int[][] arrIdxToSegIdx = new int[nums.length][];
        boolean[] isDecs = new boolean[nums.length];
        sums[0] = nums[0];
        int count = 0;
        arrIdxToSegIdx[0] = new int[] {-1, size - 1};
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isDecs[i] = true;
                count++;
            }
            lefts[size + i - 2] = i - 1;
            rights[size + i - 2] = i;
            segment[size + i - 2] = nums[i - 1] + nums[i];
            arrIdxToSegIdx[i] = new int[] {size + i - 2, size + i - 1};
            sums[i] = nums[i];
        }
        arrIdxToSegIdx[nums.length - 1][1] = -1;
        for (int i = size - 2; i >= 0; i--) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            segment[i] = Math.min(segment[l], segment[r]);
        }
        int res = 0;
        while (count > 0) {
            int segIdx = 0;
            while (2 * segIdx + 1 < segment.length) {
                int l = 2 * segIdx + 1;
                int r = 2 * segIdx + 2;
                if (segment[l] <= segment[r]) {
                    segIdx = l;
                } else {
                    segIdx = r;
                }
            }
            int arrIdxL = lefts[segIdx];
            int arrIdxR = rights[segIdx];
            long numL = sums[arrIdxL];
            long numR = sums[arrIdxR];
            if (numL > numR) {
                count--;
            }
            long newSum = sums[arrIdxL] = sums[arrIdxL] + sums[arrIdxR];
            int[] leftPointer = arrIdxToSegIdx[arrIdxL];
            int[] rightPointer = arrIdxToSegIdx[arrIdxR];
            int prvSegIdx = leftPointer[0];
            int nextSegIdx = rightPointer[1];
            leftPointer[1] = nextSegIdx;
            if (prvSegIdx != -1) {
                int l = lefts[prvSegIdx];
                if (sums[l] > numL && sums[l] <= newSum) {
                    count--;
                } else if (sums[l] <= numL && sums[l] > newSum) {
                    count++;
                }
                modify(segment, prvSegIdx, sums[l] + newSum);
            }
            if (nextSegIdx != -1) {
                int r = rights[nextSegIdx];
                if (numR > sums[r] && newSum <= sums[r]) {
                    count--;
                } else if (numR <= sums[r] && newSum > sums[r]) {
                    count++;
                }
                modify(segment, nextSegIdx, newSum + sums[r]);
                lefts[nextSegIdx] = arrIdxL;
            }
            modify(segment, segIdx, Long.MAX_VALUE);
            res++;
        }
        return res;
    }

    private void modify(long[] segment, int idx, long num) {
        if (segment[idx] == num) {
            return;
        }
        segment[idx] = num;
        while (idx != 0) {
            idx = (idx - 1) / 2;
            int l = 2 * idx + 1;
            int r = 2 * idx + 2;
            segment[idx] = Math.min(segment[l], segment[r]);
        }
    }
}
