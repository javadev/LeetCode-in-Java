package g3301_3400.s3398_smallest_substring_with_identical_characters_i;

// #Hard #Array #Binary_Search #Enumeration #2025_01_06_Time_1_ms_(100.00%)_Space_42.72_MB_(39.94%)

public class Solution {
    public int minLength(String s, int ops) {
        char[] arr2 = s.toCharArray();
        int q = '0';
        int w = '1';
        int p1 = ops;
        int p2 = ops;
        for (int i = 0; i < s.length(); i++) {
            if (arr2[i] != q) {
                p1--;
            }
            if (arr2[i] != w) {
                p2--;
            }
            if (q == '0') {
                q = '1';
            } else {
                q = '0';
            }
            if (w == '0') {
                w = '1';
            } else {
                w = '0';
            }
        }
        if (p1 >= 0 || p2 >= 0) {
            return 1;
        }
        int low = 2;
        int high = s.length();
        int ans = 0;
        int n = s.length();
        while (low <= high) {
            int mid = (low + high) / 2;
            char[] arr = s.toCharArray();
            int p = ops;
            int c = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    c++;
                } else {
                    c = 1;
                }
                if (c > mid) {
                    if (arr[i - 1] == '0') {
                        arr[i - 1] = '1';
                    } else {
                        arr[i - 1] = '0';
                    }
                    p--;
                    c = 0;
                }
            }
            if (p < 0) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
