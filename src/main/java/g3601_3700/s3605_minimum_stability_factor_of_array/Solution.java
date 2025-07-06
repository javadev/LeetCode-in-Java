package g3601_3700.s3605_minimum_stability_factor_of_array;

// #Hard #2025_07_06_Time_105_ms_(80.71%)_Space_64.43_MB_(_%)

public class Solution {
    public int minStable(int[] nums, int maxC) {
        int n = nums.length;
        int cnt = 0;
        int idx = 0;
        while (idx < n) {
            cnt += nums[idx] >= 2 ? 1 : 0;
            idx++;
        }
        if (cnt <= maxC) {
            return 0;
        }
        int[] logs = new int[n + 1];
        int maxLog = 0;
        int temp = n;
        while (temp > 0) {
            maxLog++;
            temp >>= 1;
        }
        int[][] table = new int[maxLog + 1][n];
        buildLogs(logs, n);
        buildTable(table, nums, logs, n, maxLog);
        return binarySearch(nums, maxC, n, logs, table);
    }

    private void buildLogs(int[] logs, int n) {
        int i = 2;
        while (i <= n) {
            logs[i] = logs[i >> 1] + 1;
            i++;
        }
    }

    private void buildTable(int[][] table, int[] nums, int[] ignoredLogs, int n, int maxLog) {
        int pos = 0;
        while (pos < n) {
            table[0][pos] = nums[pos];
            pos++;
        }
        int level = 1;
        while (level <= maxLog) {
            int start = 0;
            while (start + (1 << level) <= n) {
                table[level][start] =
                        gcd(table[level - 1][start], table[level - 1][start + (1 << (level - 1))]);
                start++;
            }
            level++;
        }
    }

    private int binarySearch(int[] nums, int maxC, int n, int[] logs, int[][] table) {
        int left = 1;
        int right = n;
        int result = n;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            boolean valid = isValid(nums, maxC, mid, logs, table);
            result = valid ? mid : result;
            int newLeft = valid ? left : mid + 1;
            int newRight = valid ? mid - 1 : right;
            left = newLeft;
            right = newRight;
        }
        return result;
    }

    private boolean isValid(int[] arr, int limit, int segLen, int[] logs, int[][] table) {
        int n = arr.length;
        int window = segLen + 1;
        int cuts = 0;
        int prevCut = -1;
        int pos = 0;
        while (pos + window - 1 < n && cuts <= limit) {
            int rangeGcd = getRangeGcd(pos, pos + window - 1, logs, table);
            if (rangeGcd >= 2) {
                boolean shouldCut = prevCut < pos;
                cuts += shouldCut ? 1 : 0;
                prevCut = shouldCut ? pos + window - 1 : prevCut;
            }
            pos++;
        }
        return cuts <= limit;
    }

    private int getRangeGcd(int left, int right, int[] logs, int[][] table) {
        int k = logs[right - left + 1];
        return gcd(table[k][left], table[k][right - (1 << k) + 1]);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
