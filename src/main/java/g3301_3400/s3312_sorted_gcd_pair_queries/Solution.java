package g3301_3400.s3312_sorted_gcd_pair_queries;

// #Hard #Array #Hash_Table #Math #Binary_Search #Prefix_Sum #Counting #Number_Theory #Combinatorics
// #2024_10_08_Time_29_ms_(94.69%)_Space_63.4_MB_(63.72%)

public class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 1;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        long[] gcdDp = new long[max + 1];
        for (int num : nums) {
            gcdDp[num]++;
        }
        for (int i = 1; i <= max; i++) {
            long count = 0;
            for (int j = i; j <= max; j = j + i) {
                count += gcdDp[j];
            }
            gcdDp[i] = ((count - 1) * count) / 2;
        }
        for (int i = max; i > 0; i--) {
            for (int j = i + i; j <= max; j = j + i) {
                gcdDp[i] -= gcdDp[j];
            }
        }
        for (int i = 1; i <= max; i++) {
            gcdDp[i] += gcdDp[i - 1];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = binarySearch(max, gcdDp, queries[i] + 1);
        }
        return result;
    }

    private int binarySearch(int n, long[] arr, long val) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < val) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
