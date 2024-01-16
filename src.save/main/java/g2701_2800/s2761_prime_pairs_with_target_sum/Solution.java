package g2701_2800.s2761_prime_pairs_with_target_sum;

// #Medium #Array #Math #Enumeration #Number_Theory
// #2023_09_25_Time_57_ms_(99.24%)_Space_56.4_MB_(10.58%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    private static final HashSet<Integer> PRIMES = new HashSet<>();
    private static final List<Integer> LIST = new ArrayList<>();

    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int a : LIST) {
            int other = n - a;
            if (other < n / 2 || a > n / 2) {
                break;
            }
            if (PRIMES.contains(other)) {
                answer.add(List.of(a, other));
            }
        }
        return answer;
    }

    static {
        int m = 1000001;
        boolean[] visited = new boolean[m];
        for (int i = 2; i < m; i++) {
            if (!visited[i]) {
                PRIMES.add(i);
                LIST.add(i);
                int j = i;
                while (j < m) {
                    visited[j] = true;
                    j += i;
                }
            }
        }
    }
}
