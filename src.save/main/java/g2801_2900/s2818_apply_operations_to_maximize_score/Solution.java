package g2801_2900.s2818_apply_operations_to_maximize_score;

// #Hard #Array #Math #Greedy #Stack #Monotonic_Stack #Number_Theory
// #2023_11_20_Time_94_ms_(100.00%)_Space_58.7_MB_(59.26%)

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    private static final int N = 100000;
    private static final int[] PRIME_SCORES = computePrimeScores();
    private static final int MOD = 1_000_000_000 + 7;

    public int maximumScore(List<Integer> nums, int k) {
        // count strictly using nums.get(i) as the selected num
        int[] dp = new int[nums.size()];
        // [val, index]
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2[0], o1[0]));
        Deque<int[]> monoStack = new ArrayDeque<>();
        Arrays.fill(dp, 1);
        for (int i = 0; i <= nums.size(); i++) {
            int score = Integer.MAX_VALUE;
            if (i < nums.size()) {
                score = PRIME_SCORES[nums.get(i)];
            }
            // when an element is poped, its right bound is confirmed: (i - left + 1) * (right - i +
            // 1)
            while (!monoStack.isEmpty() && monoStack.peekFirst()[0] < score) {
                int popIndex = monoStack.pollFirst()[1];
                int actualRightIndexOfPopedElement = i - 1;
                dp[popIndex] *= (actualRightIndexOfPopedElement - popIndex + 1);
            }
            // when an element is pushed, its left bound is confirmed: (i - left + 1) * (right - i +
            // 1)
            if (i < nums.size()) {
                int peekIndex = monoStack.isEmpty() ? -1 : monoStack.peekFirst()[1];
                int actualLeftIndexOfCurrentElement = peekIndex + 1;
                dp[i] *= (i - actualLeftIndexOfCurrentElement + 1);
                monoStack.offerFirst(new int[] {score, i});
                pq.offer(new int[] {nums.get(i), i});
            }
        }
        long result = 1;
        while (k > 0) {
            int[] pair = pq.poll();
            int val = pair[0];
            int index = pair[1];
            int times = Math.min(k, dp[index]);
            long power = pow(val, times);
            result *= power;
            result %= MOD;
            k -= times;
        }
        return (int) result;
    }

    private static int[] computePrimeScores() {
        int[] primeCnt = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (primeCnt[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    primeCnt[j]++;
                }
            }
        }
        return primeCnt;
    }

    private long pow(long val, int times) {
        if (times == 1) {
            return val % MOD;
        }
        long subProblemRes = pow(val, times / 2);
        long third = 1L;
        if (times % 2 == 1) {
            third = val;
        }
        return subProblemRes * subProblemRes % MOD * third % MOD;
    }
}
