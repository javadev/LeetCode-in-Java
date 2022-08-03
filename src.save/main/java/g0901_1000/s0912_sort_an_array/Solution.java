package g0901_1000.s0912_sort_an_array;

// #Medium #Array #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Merge_Sort #Bucket_Sort
// #Counting_Sort #Radix_Sort #Udemy_Sorting_Algorithms
// #2022_03_28_Time_25_ms_(38.15%)_Space_69.7_MB_(46.69%)

public class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] sortedArr = new int[1];
            sortedArr[0] = arr[lo];
            return sortedArr;
        }
        int mid = (lo + hi) / 2;
        int[] leftArray = mergeSort(arr, lo, mid);
        int[] rightArray = mergeSort(arr, mid + 1, hi);
        return mergeSortedArray(leftArray, rightArray);
    }

    private int[] mergeSortedArray(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }
        while (i < a.length) {
            ans[k++] = a[i++];
        }
        while (j < b.length) {
            ans[k++] = b[j++];
        }
        return ans;
    }
}
