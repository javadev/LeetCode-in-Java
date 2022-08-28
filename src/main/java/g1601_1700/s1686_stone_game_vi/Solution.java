package g1601_1700.s1686_stone_game_vi;

// #Medium #Array #Math #Sorting #Greedy #Heap_Priority_Queue #Game_Theory
// #2022_04_18_Time_139_ms_(62.50%)_Space_60.1_MB_(73.53%)

import java.util.PriorityQueue;

@SuppressWarnings("java:S1210")
public class Solution {
    private static class Pair implements Comparable<Pair> {
        int sum;
        int a;
        int b;

        Pair(int a, int b) {
            this.sum = a + b;
            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair p) {
            return p.sum - this.sum;
        }
    }

    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < aliceValues.length; i++) {
            pq.add(new Pair(aliceValues[i], bobValues[i]));
        }
        boolean turn = true;
        int a = 0;
        int b = 0;
        while (!pq.isEmpty()) {
            if (turn) {
                a += pq.poll().a;
            } else {
                b += pq.poll().b;
            }
            turn = !turn;
        }
        return Integer.compare(a, b);
    }
}
