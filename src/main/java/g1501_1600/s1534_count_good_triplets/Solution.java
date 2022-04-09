package g1501_1600.s1534_count_good_triplets;

// #Easy #Array #Enumeration #2022_04_09_Time_14_ms_(82.96%)_Space_42.6_MB_(6.55%)

public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i, j, k, count = 0;
        for (i = 0; i < (arr.length) - 2; i++) {
            for (j = i + 1; j < (arr.length) - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
