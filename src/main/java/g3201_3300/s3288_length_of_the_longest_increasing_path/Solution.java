package g3201_3300.s3288_length_of_the_longest_increasing_path;

// #Hard #Array #Sorting #Binary_Search #2024_09_15_Time_34_ms_(100.00%)_Space_106.2_MB_(50.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxPathLength(int[][] coordinates, int k) {
        List<int[]> upper = new ArrayList<>();
        List<int[]> lower = new ArrayList<>();
        for (int[] pair : coordinates) {
            if (pair[0] > coordinates[k][0] && pair[1] > coordinates[k][1]) {
                upper.add(pair);
            }
            if (pair[0] < coordinates[k][0] && pair[1] < coordinates[k][1]) {
                lower.add(pair);
            }
        }
        upper.sort(
                (a, b) -> {
                    if (a[0] == b[0]) {
                        return b[1] - a[1];
                    } else {
                        return a[0] - b[0];
                    }
                });
        lower.sort(
                (a, b) -> {
                    if (a[0] == b[0]) {
                        return b[1] - a[1];
                    } else {
                        return a[0] - b[0];
                    }
                });
        return longestIncreasingLength(upper) + longestIncreasingLength(lower) + 1;
    }

    private int longestIncreasingLength(List<int[]> array) {
        List<Integer> list = new ArrayList<>();
        for (int[] pair : array) {
            int m = list.size();
            if (m == 0 || list.get(m - 1) < pair[1]) {
                list.add(pair[1]);
            } else {
                int idx = binarySearch(list, pair[1]);
                list.set(idx, pair[1]);
            }
        }
        return list.size();
    }

    private int binarySearch(List<Integer> list, int target) {
        int n = list.size();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
