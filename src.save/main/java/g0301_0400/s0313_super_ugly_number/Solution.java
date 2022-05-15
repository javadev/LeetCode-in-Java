package g0301_0400.s0313_super_ugly_number;

// #Medium #Array #Hash_Table #Dynamic_Programming #Math #Heap_Priority_Queue #Acceptance_45.7%
// #2022_03_14_Time_280_ms_(86.61%)_Space_46.9_MB_(30.44%)

public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (primes.length == 0) {
            return 1;
        }
        int[] uglies = new int[n];
        uglies[0] = 1;
        int[] uglyToMultiplyBy = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int min = primes[0] * uglies[uglyToMultiplyBy[0]];
            int minIdx = 0;
            for (int j = 1; j < primes.length; j++) {
                int currNum = primes[j] * uglies[uglyToMultiplyBy[j]];
                if (currNum < min) {
                    min = currNum;
                    minIdx = j;
                } else if (currNum == min) {
                    uglyToMultiplyBy[j]++;
                }
            }
            uglyToMultiplyBy[minIdx]++;
            uglies[i] = min;
        }
        return uglies[n - 1];
    }
}
