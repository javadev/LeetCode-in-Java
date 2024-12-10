package g3301_3400.s3377_digit_operations_to_make_two_integers_equal;

// #Medium #Math #Heap_Priority_Queue #Graph #Shortest_Path #Number_Theory
// #2024_12_10_Time_246_ms_(38.59%)_Space_45.2_MB_(73.52%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int minOperations(int n, int m) {
        int limit = 100000;
        boolean[] sieve = new boolean[limit + 1];
        boolean[] visited = new boolean[limit];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    sieve[j] = false;
                }
            }
        }
        if (sieve[n]) {
            return -1;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        visited[n] = true;
        pq.add(new int[] {n, n});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int num = current[1];
            char[] temp = Integer.toString(num).toCharArray();
            if (num == m) {
                return cost;
            }
            for (int j = 0; j < temp.length; j++) {
                char old = temp[j];
                for (int i = -1; i <= 1; i++) {
                    int digit = old - '0';
                    if ((digit == 9 && i == 1) || (digit == 0 && i == -1)) {
                        continue;
                    }
                    temp[j] = (char) (i + digit + '0');
                    int newnum = Integer.parseInt(new String(temp));
                    if (!sieve[newnum] && !visited[newnum]) {
                        visited[newnum] = true;
                        pq.add(new int[] {cost + newnum, newnum});
                    }
                }
                temp[j] = old;
            }
        }
        return -1;
    }
}
