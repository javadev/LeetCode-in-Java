package g3001_3100.s3035_maximum_palindromes_after_operations;

// #Medium #Array #String #Hash_Table #Sorting #Greedy #Counting
// #2024_03_01_Time_4_ms_(99.13%)_Space_44.9_MB_(90.28%)

public class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int[] ar = new int[26];
        int[] dp = new int[101];
        int s = 0;
        int p = 0;
        int ans = 0;
        for (String str : words) {
            for (char c : str.toCharArray()) {
                ar[c - 'a']++;
            }
            dp[str.length()]++;
        }
        for (int j : ar) {
            s += j % 2;
            p += (j / 2);
        }
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] > 0) {
                if (i % 2 == 0) {
                    while (dp[i] > 0 && p > 0) {
                        p -= i / 2;
                        if (p >= 0) {
                            ans++;
                        }
                        dp[i]--;
                    }
                } else {
                    while (dp[i] > 0 && (i == 1 || p > 0)) {
                        if (s == 0) {
                            s += 2;
                            p--;
                        }
                        s--;
                        p -= (i - 1) / 2;
                        if (p >= 0) {
                            ans++;
                        }
                        dp[i]--;
                    }
                }
            }
        }
        return ans;
    }
}
