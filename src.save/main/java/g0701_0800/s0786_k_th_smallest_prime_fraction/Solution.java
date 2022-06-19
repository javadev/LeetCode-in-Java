package g0701_0800.s0786_k_th_smallest_prime_fraction;

// #Medium #Array #Binary_Search #Heap_Priority_Queue
// #2022_03_26_Time_2_ms_(96.60%)_Space_42.4_MB_(86.79%)

public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 1.0;
        while (low < high) {
            double mid = (low + high) / 2;
            int[] res = getFractionsLessThanMid(arr, n, mid);
            if (res[0] == k) {
                return new int[] {arr[res[1]], arr[res[2]]};
            } else if (res[0] > k) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return new int[] {};
    }

    private int[] getFractionsLessThanMid(int[] arr, int n, double mid) {
        double maxLessThanMid = 0.0;
        // stores indices of max fraction less than mid;
        int x = 0;
        int y = 0;
        // for storing fractions less than mid
        int total = 0;
        int j = 1;
        for (int i = 0; i < n - 1; i++) {
            // while fraction is greater than mid increment j
            while (j < n && arr[i] > arr[j] * mid) {
                j++;
            }
            if (j == n) {
                break;
            }
            // j fractions greater than mid, n-j fractions smaller than mid, add fractions smaller
            // than mid to total
            total += (n - j);
            double fraction = (double) arr[i] / arr[j];
            if (fraction > maxLessThanMid) {
                maxLessThanMid = fraction;
                x = i;
                y = j;
            }
        }
        return new int[] {total, x, y};
    }
}
