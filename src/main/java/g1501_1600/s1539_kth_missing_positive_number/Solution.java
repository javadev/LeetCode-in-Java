package g1501_1600.s1539_kth_missing_positive_number;

// #Easy #Array #Binary_Search #Binary_Search_I_Day_6
// #2022_04_10_Time_0_ms_(100.00%)_Space_42.1_MB_(82.14%)

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missed = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                missed += arr[0] - 1;
                if (missed >= k) {
                    return k;
                }
            } else {
                missed += arr[i] - arr[i - 1] - 1;
                if (missed >= k) {
                    missed -= arr[i] - arr[i - 1] - 1;
                    int result = arr[i - 1];
                    while (missed++ < k) {
                        result++;
                    }
                    return result;
                }
            }
        }
        int result = arr[arr.length - 1];
        while (missed++ < k) {
            result++;
        }
        return result;
    }
}
