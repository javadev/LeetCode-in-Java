package g3801_3900.s3826_minimum_partition_score;

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Divide_and_Conquer #Queue #Monotonic_Queue
// #Principal #Biweekly_Contest_175 #2026_06_09_Time_70_ms_(96.97%)_Space_47.29_MB_(57.58%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    private long[] prefix;

    private boolean isRedundant(Line l1, Line l2, Line l3) {
        return (double) (l3.intercept - l1.intercept) * (l1.slope - l2.slope)
                <= (double) (l2.intercept - l1.intercept) * (l1.slope - l3.slope);
    }

    private Pair solveWithPenalty(long lambda) {
        Deque<Line> dq = new ArrayDeque<>();
        dq.addLast(new Line(0, 0, 0));

        long di = 0;
        int pi = 0;

        for (int i = 1; i < prefix.length; i++) {
            long x = prefix[i];

            // query
            while (dq.size() > 1) {
                Line first = dq.pollFirst();
                Line second = dq.peekFirst();
                if (first.eval(x) <= second.eval(x)) {
                    dq.addFirst(first);
                    break;
                }
            }

            Line best = dq.peekFirst();
            di = x * x + x + 2 * lambda + best.eval(x);
            pi = best.partition + 1;

            Line newLine = new Line(-2 * x, di + x * x - x, pi);

            while (dq.size() > 1) {
                Line last = dq.pollLast();
                Line secondLast = dq.peekLast();
                if (!isRedundant(secondLast, last, newLine)) {
                    dq.addLast(last);
                    break;
                }
            }
            dq.addLast(newLine);
        }

        return new Pair(di, pi);
    }

    public long minPartitionScore(int[] nums, int k) {
        int n = nums.length;
        prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        long start = 0;
        long end = (long) 1e15;
        long bestLambda = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            Pair res = solveWithPenalty(mid);
            if (res.partition <= k) {
                bestLambda = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        Pair ans = solveWithPenalty(bestLambda);
        return (ans.score - 2L * k * bestLambda) / 2;
    }

    private static class Line {
        long slope;
        long intercept;
        int partition;

        Line(long slope, long intercept, int partition) {
            this.slope = slope;
            this.intercept = intercept;
            this.partition = partition;
        }

        long eval(long x) {
            return slope * x + intercept;
        }
    }

    private static class Pair {
        long score;
        int partition;

        Pair(long score, int partition) {
            this.score = score;
            this.partition = partition;
        }
    }
}
