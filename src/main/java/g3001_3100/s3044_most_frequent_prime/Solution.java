package g3001_3100.s3044_most_frequent_prime;

// #Medium #Array #Hash_Table #Math #Matrix #Counting #Enumeration #Number_Theory
// #2024_02_29_Time_6_ms_(100.00%)_Space_43.6_MB_(97.08%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int max = 0;
    private int freqNum = -1;

    public int mostFrequentPrime(int[][] mat) {
        int[][] nexts =
                new int[][] {{1, 1}, {-1, -1}, {1, -1}, {-1, 1}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, Integer> primeFreq = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int[] next : nexts) {
                    getPrime(i, j, mat, 0, next, primeFreq);
                }
            }
        }
        return freqNum;
    }

    private void getPrime(
            int i, int j, int[][] mat, int num, int[] next, Map<Integer, Integer> primeFreq) {
        int m = mat.length;
        int n = mat[0].length;
        if (i < 0 || j < 0 || i == m || j == n) {
            return;
        }
        num = num * 10 + mat[i][j];
        if (num > 10 && isPrime(num)) {
            int count = primeFreq.getOrDefault(num, 0) + 1;
            if ((count == max && freqNum < num) || count > max) {
                freqNum = num;
            }
            max = Math.max(max, count);
            primeFreq.put(num, count);
        }
        getPrime(i + next[0], j + next[1], mat, num, next, primeFreq);
    }

    private boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num == 1 || (num & 1) == 0) {
            return false;
        }
        int n = (int) Math.sqrt(num);
        for (int i = 3; i <= n; i += 2) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
