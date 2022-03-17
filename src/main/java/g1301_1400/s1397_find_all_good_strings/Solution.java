package g1301_1400.s1397_find_all_good_strings;

// #Hard #String #Dynamic_Programming #String_Matching
// #2022_03_17_Time_85_ms_(41.25%)_Space_42.5_MB_(83.75%)

@SuppressWarnings("java:S1172")
public class Solution {
    private int mod = 1_000_000_007;
    private int[] next;

    public int findGoodStrings(int n, String s1, String s2, String evil) {
        char[] s1arr = s1.toCharArray();
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1arr[i] > 'a') {
                s1arr[i] = (char) (s1arr[i] - 1);
                break;
            } else {
                s1arr[i] = 'z';
            }
        }
        s1 = new String(s1arr);
        next = getNext(evil);
        if (s1.compareTo(s2) > 0) {
            return lessOrEqualThan(s2, evil);
        }
        return (lessOrEqualThan(s2, evil) - lessOrEqualThan(s1, evil) + mod) % mod;
    }

    private int lessOrEqualThan(String s, String e) {
        long[][][] dp = new long[s.length() + 1][e.length() + 1][2];
        dp[0][0][1] = 1;
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int state = 0; state < e.length(); state++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    int nextstate = getNextState(state, c, e);
                    dp[i + 1][nextstate][0] = (dp[i + 1][nextstate][0] + dp[i][state][0]) % mod;
                }
                for (char c = 'a'; c < s.charAt(i); c++) {
                    int nextstate = getNextState(state, c, e);
                    dp[i + 1][nextstate][0] = (dp[i + 1][nextstate][0] + dp[i][state][1]) % mod;
                }
                int nextstate = getNextState(state, s.charAt(i), e);
                dp[i + 1][nextstate][1] = (dp[i + 1][nextstate][1] + dp[i][state][1]) % mod;
            }
        }
        for (int i = 0; i < e.length(); i++) {
            res = (res + dp[s.length()][i][0]) % mod;
            res = (res + dp[s.length()][i][1]) % mod;
        }
        return (int) res;
    }

    private int getNextState(int prevState, char nextChar, String evil) {
        int idx = prevState;
        while (idx != -1 && evil.charAt(idx) != nextChar) {
            idx = next[idx];
        }
        return idx + 1;
    }

    private int[] getNext(String e) {
        int len = e.length();
        int[] localNext = new int[len];
        localNext[0] = -1;
        int last = -1;
        int i = 0;
        while (i < len - 1) {
            if (last == -1 || e.charAt(i) == e.charAt(last)) {
                i++;
                last++;
                localNext[i] = last;
            } else {
                last = localNext[last];
            }
        }
        return localNext;
    }
}
