package g1101_1200.s1191_k_concatenation_maximum_sum;

// #Medium #Array #Dynamic_Programming #2022_03_03_Time_6_ms_(73.85%)_Space_59.8_MB_(30.38%)

public class Solution {
    private long mod = 1000000007;

    public int kConcatenationMaxSum(int[] arr, int k) {
        // int kadane = Kadane(arr);
        // #1 when k 1 simply calculate kadanes
        if (k == 1) {
            return (int) (kadane(arr) % mod);
        }
        // #2 else calculate the total sum and then check if sum is -Ve or +Ve
        long totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        // #3 when negative then calculate of arr 2 times only the answer is in there only
        if (totalSum < 0) {
            // when -ve sum put a extra check here of max from 0
            return (int) Math.max(kadaneTwo(arr) % mod, 0);
        } else {
            // #4 when sum is positve then the ans is kadane of 2 + sum * (k-2);
            // these two are used sUm*(k-2) ensures that all other are also included
            return (int) ((kadaneTwo(arr) + ((k - 2) * totalSum) + mod) % mod);
        }
    }

    private long kadane(int[] arr) {
        long max = arr[0];
        long cur = 0;
        for (int n : arr) {
            cur += n;
            max = Math.max(max, cur);
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }

    private long kadaneTwo(int[] arr) {
        long max = arr[0];
        long cur = 0;
        for (int i = 0; i < arr.length * 2; i++) {
            cur += arr[i % arr.length];
            max = Math.max(max, cur);
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }
}
