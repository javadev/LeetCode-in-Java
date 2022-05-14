package g1901_2000.s1925_count_square_sum_triples;

// #Easy #Math #Enumeration #2022_05_14_Time_25_ms_(48.78%)_Space_41.3_MB_(41.26%)

public class Solution {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int product = i * i + j * j;
                double sq = Math.sqrt(product);
                if (sq <= n && (sq - Math.floor(sq) == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
