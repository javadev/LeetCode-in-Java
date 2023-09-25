package g0001_0100.s0084_largest_rectangle_in_histogram;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Stack #Monotonic_Stack
// #Big_O_Time_O(n_log_n)_Space_O(log_n) #2022_06_20_Time_11_ms_(98.34%)_Space_72.8_MB_(81.14%)

public class Solution {
    public int largestRectangleArea(int[] heights) {
        return largestArea(heights, 0, heights.length);
    }

    private int largestArea(int[] a, int start, int limit) {
        if (a == null || a.length == 0) {
            return 0;
        }
        if (start == limit) {
            return 0;
        }
        if (limit - start == 1) {
            return a[start];
        }
        if (limit - start == 2) {
            int maxOfTwoBars = Math.max(a[start], a[start + 1]);
            int areaFromTwo = Math.min(a[start], a[start + 1]) * 2;
            return Math.max(maxOfTwoBars, areaFromTwo);
        }
        if (checkIfSorted(a, start, limit)) {
            int maxWhenSorted = 0;
            for (int i = start; i < limit; i++) {
                if (a[i] * (limit - i) > maxWhenSorted) {
                    maxWhenSorted = a[i] * (limit - i);
                }
            }
            return maxWhenSorted;
        } else {
            int minInd = findMinInArray(a, start, limit);
            return maxOfThreeNums(
                    largestArea(a, start, minInd),
                    a[minInd] * (limit - start),
                    largestArea(a, minInd + 1, limit));
        }
    }

    private int findMinInArray(int[] a, int start, int limit) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int index = start; index < limit; index++) {
            if (a[index] < min) {
                min = a[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    private boolean checkIfSorted(int[] a, int start, int limit) {
        for (int i = start + 1; i < limit; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int maxOfThreeNums(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
