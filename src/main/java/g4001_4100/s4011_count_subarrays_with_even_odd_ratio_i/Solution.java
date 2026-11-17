package g4001_4100.s4011_count_subarrays_with_even_odd_ratio_i;

// #Medium #Array #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree #Merge_Sort
// #Senior #Weekly_Contest_513 #2026_11_17_Time_6_ms_(99.17%)_Space_46.46_MB_(30.99%)

public class Solution {
    private int count = 0;

    public int countRatioSubarrays(int[] nums, int a, int b) {
        count = 0;
        int n = nums.length;
        int[] p = new int[n + 1];
        for (int i = 0; i < n; i++) {
            p[i + 1] = p[i] + (nums[i] % 2 == 0 ? b : -a);
        }
        mergesort(p);
        return count;
    }

    private void mergesort(int[] p) {
        int n = p.length;
        if (n < 2) {
            return;
        }
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = p[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = p[idx++];
        }
        mergesort(a);
        mergesort(b);
        merge(a, b, p);
    }

    private void merge(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                count += (a.length - i);
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
