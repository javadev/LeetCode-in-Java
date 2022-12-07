package g0901_1000.s0973_k_closest_points_to_origin;

// #Medium #Array #Math #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Geometry #Quickselect
// #Data_Structure_II_Day_21_Heap_Priority_Queue #Programming_Skills_II_Day_8
// #2022_03_31_Time_4_ms_(98.26%)_Space_112.9_MB_(78.08%)

import java.util.Arrays;

public class Solution {
    private int calDistSqr(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    private void swap(int[][] points, int i, int j) {
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    private void quickSelect(int[][] points, int k, int left, int right) {
        if (left >= right) {
            return;
        }
        // choose pivot index, could be randomly
        int pIdx = (right - left) / 2 + left;
        int[] pivot = points[pIdx];
        int pivotDist = calDistSqr(pivot);
        // put pivot into the last position
        swap(points, pIdx, right);
        // i: for iterating the array; curPIdx: the proper position to put pivot later
        int i = left;
        int curPIdx = left;
        while (i < right) {
            if (calDistSqr(points[i]) <= pivotDist) {
                // put all the smaller item to the left side of the array
                swap(points, i, curPIdx);
                // move proper pivot position forward
                curPIdx++;
            }
            i++;
        }
        // put pivot back into the correct position
        swap(points, curPIdx, right);
        // for ele in arr[0:curPIdx] => ele <= arr[curPIdx]
        int num = curPIdx - left + 1;
        if (num == k) {
            return;
        }
        if (num < k) {
            quickSelect(points, k - num, curPIdx + 1, right);
        }
        if (num > k) {
            quickSelect(points, k, left, curPIdx - 1);
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        quickSelect(points, k, 0, points.length - 1);
        return Arrays.copyOf(points, k);
    }
}
