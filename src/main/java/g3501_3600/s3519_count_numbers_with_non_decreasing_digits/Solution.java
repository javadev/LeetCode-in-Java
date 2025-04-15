package g3501_3600.s3519_count_numbers_with_non_decreasing_digits;

// #Hard #String #Dynamic_Programming #Math #2025_04_14_Time_19_ms_(100.00%)_Space_45.43_MB_(50.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countNumbers(String l, String r, int b) {
        long ans1 = find(r.toCharArray(), b);
        char[] start = subTractOne(l.toCharArray());
        long ans2 = find(start, b);
        return (int) ((ans1 - ans2) % 1000000007L);
    }

    private long find(char[] arr, int b) {
        int[] nums = convertNumToBase(arr, b);
        Long[][][] dp = new Long[nums.length][2][11];
        return solve(0, nums, 1, b, 0, dp) - 1;
    }

    private long solve(int i, int[] arr, int tight, int base, int last, Long[][][] dp) {
        if (i == arr.length) {
            return 1L;
        }
        if (dp[i][tight][last] != null) {
            return dp[i][tight][last];
        }
        int till = base - 1;
        if (tight == 1) {
            till = arr[i];
        }
        long ans = 0;
        for (int j = 0; j <= till; j++) {
            if (j >= last) {
                ans = (ans + solve(i + 1, arr, tight & (j == arr[i] ? 1 : 0), base, j, dp));
            }
        }
        dp[i][tight][last] = ans;
        return ans;
    }

    private char[] subTractOne(char[] arr) {
        int n = arr.length;
        int i = n - 1;
        while (i >= 0 && arr[i] == '0') {
            arr[i--] = '9';
        }
        int x = arr[i] - '0' - 1;
        arr[i] = (char) (x + '0');
        int j = 0;
        int idx = 0;
        while (j < n && arr[j] == '0') {
            j++;
        }
        char[] res = new char[n - j];
        for (int k = j; k < n; k++) {
            res[idx++] = arr[k];
        }
        return res;
    }

    private int[] convertNumToBase(char[] arr, int base) {
        int n = arr.length;
        int[] num = new int[n];
        int i = 0;
        while (i < n) {
            num[i] = arr[i++] - '0';
        }
        List<Integer> temp = new ArrayList<>();
        int len = n;
        while (len > 0) {
            int rem = 0;
            int[] next = new int[len];
            int newLen = 0;
            int j = 0;
            while (j < len) {
                long cur = rem * 10L + num[j];
                int q = (int) (cur / base);
                rem = (int) (cur % base);
                if (newLen > 0 || q != 0) {
                    next[newLen] = q;
                    newLen++;
                }
                j++;
            }
            temp.add(rem);
            num = next;
            len = newLen;
        }
        int[] res = new int[temp.size()];
        int k = 0;
        int size = temp.size();
        while (k < size) {
            res[k] = temp.get(size - 1 - k);
            k++;
        }
        return res;
    }
}
