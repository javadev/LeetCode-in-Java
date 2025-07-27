package g3601_3700.s3629_minimum_jumps_to_reach_end_via_prime_teleportation;

// #Medium #Weekly_Contest_460 #2025_07_27_Time_116_ms_(99.81%)_Space_76.00_MB_(67.96%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int maxVal = 0;
        for (int v : nums) {
            maxVal = Math.max(maxVal, v);
        }
        boolean[] isPrime = sieve(maxVal);
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] posOfValue = new ArrayList[maxVal + 1];
        for (int i = 0; i < n; i++) {
            int v = nums[i];
            if (posOfValue[v] == null) {
                posOfValue[v] = new ArrayList<>();
            }
            posOfValue[v].add(i);
        }
        boolean[] primeProcessed = new boolean[maxVal + 1];
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(0);
        dist[0] = 0;
        while (!q.isEmpty()) {
            int i = q.poll();
            int d = dist[i];
            if (i == n - 1) {
                return d;
            }
            if (i + 1 < n && dist[i + 1] == -1) {
                dist[i + 1] = d + 1;
                q.add(i + 1);
            }
            if (i - 1 >= 0 && dist[i - 1] == -1) {
                dist[i - 1] = d + 1;
                q.add(i - 1);
            }
            int v = nums[i];
            if (v <= maxVal && isPrime[v] && !primeProcessed[v]) {
                for (int mult = v; mult <= maxVal; mult += v) {
                    ArrayList<Integer> list = posOfValue[mult];
                    if (list != null) {
                        for (int idx : list) {
                            if (dist[idx] == -1) {
                                dist[idx] = d + 1;
                                q.add(idx);
                            }
                        }
                    }
                }
                primeProcessed[v] = true;
            }
        }
        return -1;
    }

    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        if (n >= 2) {
            Arrays.fill(prime, true);
        }
        if (n >= 0) {
            prime[0] = false;
        }
        if (n >= 1) {
            prime[1] = false;
        }
        for (int i = 2; (long) i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
