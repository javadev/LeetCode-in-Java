package g1501_1600.s1574_shortest_subarray_to_be_removed_to_make_array_sorted;

// #Medium #Array #Binary_Search #Two_Pointers #Stack #Monotonic_Stack #Binary_Search_II_Day_14
// #2022_04_11_Time_2_ms_(84.97%)_Space_80.1_MB_(16.34%)

public class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left = 0;
        while (left < arr.length - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == arr.length - 1) {
            return 0;
        }
        int right = arr.length - 1;
        while (right > left && arr[right] >= arr[right - 1]) {
            right--;
        }
        if (right == 0) {
            return arr.length - 1;
        }
        int result = Math.min(arr.length - left - 1, right);
        int i = 0;
        int j = right;
        while (i <= left && j < arr.length) {
            if (arr[j] >= arr[i]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
