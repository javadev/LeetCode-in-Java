package g1701_1800.s1792_maximum_average_pass_ratio;

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2022_05_03_Time_456_ms_(89.78%)_Space_83.8_MB_(96.44%)

import java.util.PriorityQueue;

public class Solution {
    // O(m*logn+n*logn)
    // PriorityQueue
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> heap =
                new PriorityQueue<>((o1, o2) -> Double.compare(o2[0], o1[0]));
        for (int[] clas : classes) {
            double delta = profit(clas[0], clas[1]);
            heap.offer(new double[] {delta, clas[0], clas[1]});
        }
        while (extraStudents >= 1) {
            double[] temp = heap.poll();
            double pass = temp[1] + 1;
            double total = temp[2] + 1;
            double delta = profit(pass, total);
            heap.offer(new double[] {delta, pass, total});
            extraStudents--;
        }
        double average = 0d;
        while (!heap.isEmpty()) {
            double[] temp = heap.poll();
            average += temp[1] / temp[2];
        }
        return average / classes.length;
    }

    // O(1)
    private double profit(double a, double b) {
        return (a + 1) / (b + 1) - a / b;
    }
}
