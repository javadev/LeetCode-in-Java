package g1601_1700.s1643_kth_smallest_instructions;

// #Hard #Array #Dynamic_Programming #Math #Combinatorics
// #2022_04_21_Time_1_ms_(100.00%)_Space_43.3_MB_(20.97%)

@SuppressWarnings("java:S135")
public class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        StringBuilder sb = new StringBuilder();
        int v = destination[0];
        int n = v + destination[1];
        while (true) {
            int range = choose(--n, v);
            if (k <= range) {
                sb.append('H');
            } else {
                sb.append('V');
                v--;
                k -= range;
            }
            if (v == 0) {
                for (int i = 1; i <= n; i++) {
                    sb.append('H');
                }
                break;
            } else if (v == n) {
                for (int i = 1; i <= v; i++) {
                    sb.append('V');
                }
                break;
            }
        }

        return sb.toString();
    }

    private int choose(int n, int k) {
        if (n - k < k) {
            k = n - k;
        }
        int answer = 1;
        for (int i = 1; i <= k; i++) {
            answer = answer * (n + 1 - i) / i;
        }
        return answer;
    }
}
