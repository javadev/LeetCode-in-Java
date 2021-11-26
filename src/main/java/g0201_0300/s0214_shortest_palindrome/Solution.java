package g0201_0300.s0214_shortest_palindrome;

public class Solution {
    public String shortestPalindrome(String s) {
        int i;
        int x;
        int diff;
        int N = s.length();
        int M = (N << 1) + 1;
        char[] letters = new char[M];

        for (i = 0; i < N; i++) {
            letters[i] = letters[M - 1 - i] = s.charAt(i);
        }

        letters[i] = '#';

        int[] LPS = new int[M];
        LPS[0] = 0;

        for (i = 1; i < M; i++) {
            x = LPS[i - 1];

            while (letters[i] != letters[x]) {
                if (x == 0) {
                    x = -1;
                    break;
                }

                x = LPS[x - 1];
            }

            LPS[i] = x + 1;
        }

        diff = N - LPS[M - 1];
        if (diff == 0) {
            return s;
        } else {
            StringBuilder builder = new StringBuilder();
            for (i = N - 1; i >= N - diff; i--) {
                builder.append(s.charAt(i));
            }

            builder.append(s);

            return builder.toString();
        }
    }
}
