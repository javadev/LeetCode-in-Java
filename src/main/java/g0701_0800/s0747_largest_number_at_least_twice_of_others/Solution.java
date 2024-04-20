package g0701_0800.s0747_largest_number_at_least_twice_of_others;

// #Easy #Array #Sorting #2022_03_25_Time_0_ms_(100.00%)_Space_42.5_MB_(16.63%)

public class Solution {
    public int dominantIndex(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        if (arr.length == 0) {
            return -1;
        }

        int maxElement = Integer.MIN_VALUE;
        for (int a : arr) {
            maxElement = Math.max(maxElement, a);
        }
        int index = findNum(maxElement, arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            if (arr[i] * 2 > maxElement) {
                return -1;
            }
        }

        return index;
    }

    public int findNum(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
