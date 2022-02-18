package g0901_1000.s0941_valid_mountain_array;

// #Easy #Array #2022_02_18_Time_2_ms_(73.30%)_Space_54.3_MB_(5.33%)

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            } else {
                break;
            }
        }
        if (i == 0 || i >= arr.length - 1) {
            return false;
        }
        for (; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return i == arr.length - 1;
    }
}
