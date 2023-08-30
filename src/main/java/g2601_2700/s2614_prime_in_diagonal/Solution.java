package g2601_2700.s2614_prime_in_diagonal;

// #Easy #Array #Math #Matrix #Number_Theory #2023_08_30_Time_0_ms_(100.00%)_Space_56.5_MB_(21.81%)

public class Solution {
    public int diagonalPrime(int[][] nums) {
        int i = 0;
        int j = nums[0].length - 1;
        int lp = 0;
        while (i < nums.length) {
            int n1 = nums[i][i];
            if (n1 > lp && isPrime(n1)) {
                lp = n1;
            }
            int n2 = nums[i][j];
            if (n2 > lp && isPrime(n2)) {
                lp = n2;
            }
            i++;
            j--;
        }
        return lp;
    }

    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
