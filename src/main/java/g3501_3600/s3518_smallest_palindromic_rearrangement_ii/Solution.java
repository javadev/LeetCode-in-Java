package g3501_3600.s3518_smallest_palindromic_rearrangement_ii;

// #Hard #String #Hash_Table #Math #Counting #Combinatorics
// #2025_04_14_Time_34_ms_(100.00%)_Space_45.64_MB_(100.00%)

public class Solution {
    private static final long MAX_K = 1000001;

    public String smallestPalindrome(String inputStr, int k) {
        int[] frequency = new int[26];
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            frequency[ch - 'a']++;
        }
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if (frequency[i] % 2 == 1) {
                mid = (char) ('a' + i);
                frequency[i]--;
                break;
            }
        }
        int[] halfFreq = new int[26];
        int halfLength = 0;
        for (int i = 0; i < 26; i++) {
            halfFreq[i] = frequency[i] / 2;
            halfLength += halfFreq[i];
        }
        long totalPerms = multinomial(halfFreq);
        if (k > totalPerms) {
            return "";
        }
        StringBuilder firstHalfBuilder = new StringBuilder();
        for (int i = 0; i < halfLength; i++) {
            for (int c = 0; c < 26; c++) {
                if (halfFreq[c] > 0) {
                    halfFreq[c]--;
                    long perms = multinomial(halfFreq);
                    if (perms >= k) {
                        firstHalfBuilder.append((char) ('a' + c));
                        break;
                    } else {
                        k -= (int) perms;
                        halfFreq[c]++;
                    }
                }
            }
        }
        String firstHalf = firstHalfBuilder.toString();
        String revHalf = new StringBuilder(firstHalf).reverse().toString();
        String result;
        if (mid == 0) {
            result = firstHalf + revHalf;
        } else {
            result = firstHalf + mid + revHalf;
        }
        return result;
    }

    private long multinomial(int[] counts) {
        int tot = 0;
        for (int cnt : counts) {
            tot += cnt;
        }
        long res = 1;
        for (int i = 0; i < 26; i++) {
            int cnt = counts[i];
            res = res * binom(tot, cnt);
            if (res >= MAX_K) {
                return MAX_K;
            }
            tot -= cnt;
        }
        return res;
    }

    private long binom(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k > n - k) {
            k = n - k;
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
            if (result >= MAX_K) {
                return MAX_K;
            }
        }
        return result;
    }
}
