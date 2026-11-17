package g4001_4100.s4013_count_subarrays_with_even_odd_ratio_ii;

// #Hard #Array #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree #Merge_Sort
// #Senior_Staff #Weekly_Contest_513 #2026_11_17_Time_14_ms_(98.28%)_Space_58.65_MB_(65.52%)

public class Solution {
    public long countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        long[] arr = new long[n + 1];
        long[] temp = new long[n + 1];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] % 2 == 1 ? a : -b;
            arr[i + 1] = temp[i + 1] = sum;
        }
        return mergeSort(0, n, arr, temp);
    }

    private long mergeSort(int l, int r, long[] arr, long[] temp) {
        if (l == r) {
            return 0;
        }
        int m = (l + r) / 2;
        long result = mergeSort(l, m, temp, arr) + mergeSort(m + 1, r, temp, arr);
        int idx = l;
        int i = l;
        int j = m + 1;
        while (i <= m && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[idx++] = temp[i++];
            } else {
                result += i - l;
                arr[idx++] = temp[j++];
            }
        }
        while (i <= m) {
            arr[idx++] = temp[i++];
        }
        while (j <= r) {
            result += i - l;
            arr[idx++] = temp[j++];
        }
        return result;
    }
}
