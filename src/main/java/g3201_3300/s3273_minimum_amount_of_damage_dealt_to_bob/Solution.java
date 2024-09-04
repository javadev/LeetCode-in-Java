package g3201_3300.s3273_minimum_amount_of_damage_dealt_to_bob;

// #Hard #Array #Sorting #Greedy #2024_09_04_Time_76_ms_(100.00%)_Space_59.5_MB_(61.02%)

import java.util.Arrays;

@SuppressWarnings("java:S1210")
public class Solution {
    public long minDamage(int pw, int[] damage, int[] health) {
        long res = 0;
        long sum = 0;
        for (int e : damage) {
            sum += e;
        }
        Pair[] pairs = new Pair[damage.length];
        for (int e = 0; e < damage.length; e++) {
            pairs[e] = new Pair(damage[e], (health[e] + pw - 1) / pw);
        }
        Arrays.sort(pairs);
        for (Pair pr : pairs) {
            res += pr.val * sum;
            sum -= pr.key;
        }
        return res;
    }

    static class Pair implements Comparable<Pair> {
        int key;
        int val;

        Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Pair p) {
            return val * p.key - key * p.val;
        }
    }
}
