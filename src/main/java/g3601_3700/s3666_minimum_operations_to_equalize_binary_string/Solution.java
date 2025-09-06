package g3601_3700.s3666_minimum_operations_to_equalize_binary_string;

// #Hard #Biweekly_Contest_164 #2025_09_06_Time_4_ms_(100.00%)_Space_46.11_MB_(31.99%)

public class Solution {
    public int minOperations(String s, int k) {
        int zero = 0;
        for (char chr : s.toCharArray()) {
            zero += '1' - chr;
        }
        if (zero % 2 != 0 && k % 2 == 0) {
            return -1;
        }
        if (zero % k == 0) {
            return zero / k;
        }
        if (k % 2 == 0) {
            return get(zero, s.length(), k);
        } else {
            return get1(zero, s.length(), k);
        }
    }

    private int get(int zero, int sum, int k) {
        int l = zero;
        int r = zero;
        int res = 0;
        while (true) {
            if (l == 0) {
                return res;
            }
            int lNext;
            if (l >= k) {
                lNext = l - k;
            } else if (r >= k) {
                lNext = 0;
            } else {
                lNext = k - r;
            }
            int rNext;
            int a = sum - r;
            int b = sum - l;
            if (a >= k) {
                rNext = r + k;
            } else if (b >= k) {
                rNext = sum;
            } else {
                rNext = l + b - (k - b);
            }
            if (l == lNext && r == rNext) {
                break;
            }
            if (l > lNext) {
                l = lNext;
            }
            if (r < rNext) {
                r = rNext;
            }
            res++;
        }
        return -1;
    }

    private int get1(int zero, int sum, int k) {
        int[] l = {Integer.MAX_VALUE, zero};
        int[] r = {Integer.MIN_VALUE, zero};
        int res = 0;
        while (true) {
            int idx1 = res % 2;
            int idx = 1 - idx1;
            int lNext;
            int offset = 1 - l[idx] % 2;
            if (l[idx] >= k) {
                lNext = l[idx] - k;
            } else if (r[idx] >= k) {
                lNext = offset;
            } else {
                lNext = k - r[idx];
            }
            int rNext;
            int a = sum - r[idx];
            int b = sum - l[idx];
            if (a >= k) {
                rNext = r[idx] + k;
            } else if (b >= k) {
                rNext = sum - offset;
            } else {
                rNext = l[idx] + b - (k - b);
            }
            if (l[idx1] == lNext && r[idx1] == rNext) {
                break;
            }
            if (l[idx1] > lNext) {
                l[idx1] = lNext;
            }
            if (r[idx1] < rNext) {
                r[idx1] = rNext;
            }
            res++;
            if (l[idx1] == 0) {
                return res;
            }
        }
        return -1;
    }
}
