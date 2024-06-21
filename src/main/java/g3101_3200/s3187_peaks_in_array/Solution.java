package g3101_3200.s3187_peaks_in_array;

// #Hard #Array #Segment_Tree #Binary_Indexed_Tree
// #2024_06_21_Time_18_ms_(100.00%)_Space_137.7_MB_(31.34%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> countOfPeaks(int[] nums, int[][] queries) {
        boolean[] peaks = new boolean[nums.length];
        int[] binaryIndexedTree = new int[Integer.highestOneBit(peaks.length) * 2 + 1];
        for (int i = 1; i < peaks.length - 1; ++i) {
            if (nums[i] > Math.max(nums[i - 1], nums[i + 1])) {
                peaks[i] = true;
                update(binaryIndexedTree, i + 1, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            if (query[0] == 1) {
                int leftIndex = query[1];
                int rightIndex = query[2];
                result.add(computeRangeSum(binaryIndexedTree, leftIndex + 2, rightIndex));
            } else {
                int index = query[1];
                int value = query[2];
                nums[index] = value;
                for (int i = -1; i <= 1; ++i) {
                    int affected = index + i;
                    if (affected >= 1 && affected <= nums.length - 2) {
                        boolean peak =
                                nums[affected] > Math.max(nums[affected - 1], nums[affected + 1]);
                        if (peak != peaks[affected]) {
                            if (peak) {
                                update(binaryIndexedTree, affected + 1, 1);
                            } else {
                                update(binaryIndexedTree, affected + 1, -1);
                            }
                            peaks[affected] = peak;
                        }
                    }
                }
            }
        }
        return result;
    }

    private int computeRangeSum(int[] binaryIndexedTree, int beginIndex, int endIndex) {
        return (beginIndex <= endIndex)
                ? (query(binaryIndexedTree, endIndex) - query(binaryIndexedTree, beginIndex - 1))
                : 0;
    }

    private int query(int[] binaryIndexedTree, int index) {
        int result = 0;
        while (index != 0) {
            result += binaryIndexedTree[index];
            index -= index & -index;
        }

        return result;
    }

    private void update(int[] binaryIndexedTree, int index, int delta) {
        while (index < binaryIndexedTree.length) {
            binaryIndexedTree[index] += delta;
            index += index & -index;
        }
    }
}
