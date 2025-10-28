package g3701_3800.s3722_lexicographically_smallest_string_after_reverse;

// #Medium #Biweekly_Contest_168 #2025_10_28_Time_8_ms_(100.00%)_Space_44.85_MB_(99.91%)

public class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        char[] best = arr.clone();
        // Check all reverse first k operations
        for (int k = 1; k <= n; k++) {
            if (isBetterReverseFirstK(arr, k, best)) {
                updateBestReverseFirstK(arr, k, best);
            }
        }
        // Check all reverse last k operations
        for (int k = 1; k <= n; k++) {
            if (isBetterReverseLastK(arr, k, best)) {
                updateBestReverseLastK(arr, k, best);
            }
        }
        return new String(best);
    }

    private boolean isBetterReverseFirstK(char[] arr, int k, char[] best) {
        for (int i = 0; i < arr.length; i++) {
            char currentChar = (i < k) ? arr[k - 1 - i] : arr[i];
            if (currentChar < best[i]) {
                return true;
            }
            if (currentChar > best[i]) {
                return false;
            }
        }
        return false;
    }

    private boolean isBetterReverseLastK(char[] arr, int k, char[] best) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char currentChar = (i < n - k) ? arr[i] : arr[n - 1 - (i - (n - k))];
            if (currentChar < best[i]) {
                return true;
            }
            if (currentChar > best[i]) {
                return false;
            }
        }
        return false;
    }

    private void updateBestReverseFirstK(char[] arr, int k, char[] best) {
        for (int i = 0; i < k; i++) {
            best[i] = arr[k - 1 - i];
        }
        if (arr.length - k >= 0) {
            System.arraycopy(arr, k, best, k, arr.length - k);
        }
    }

    private void updateBestReverseLastK(char[] arr, int k, char[] best) {
        int n = arr.length;
        if (n - k >= 0) {
            System.arraycopy(arr, 0, best, 0, n - k);
        }
        for (int i = 0; i < k; i++) {
            best[n - k + i] = arr[n - 1 - i];
        }
    }
}
