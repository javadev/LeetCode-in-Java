package g1501_1600.s1552_magnetic_force_between_two_balls;

// #Medium #Array #Sorting #Binary_Search #Binary_Search_II_Day_4
// #2022_04_11_Time_39_ms_(99.65%)_Space_56.9_MB_(90.25%)

import java.util.Arrays;

public class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return binarySearch(position, m);
    }

    private int binarySearch(int[] arr, int m) {
        int low = 0;
        int n = arr.length;
        int high = arr[n - 1];
        int max = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(arr, mid, m)) {
                if (max < mid) {
                    max = mid;
                }
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return max;
    }

    private boolean check(int[] arr, int mid, int m) {
        int pos = arr[0];
        int magnet = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pos >= mid) {
                pos = arr[i];
                magnet += 1;
                if (magnet == m) {
                    return true;
                }
            }
        }
        return false;
    }
}
