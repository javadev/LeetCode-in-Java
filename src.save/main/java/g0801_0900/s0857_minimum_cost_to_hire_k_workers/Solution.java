package g0801_0900.s0857_minimum_cost_to_hire_k_workers;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2022_03_27_Time_26_ms_(85.40%)_Space_42.6_MB_(95.75%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(wage[i], quality[i]);
        }
        Arrays.sort(workers, Comparator.comparingDouble(Worker::ratio));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int sumQuality = 0;
        double result = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Worker worker = workers[i];
            sumQuality += worker.quality;
            maxHeap.add(worker.quality);
            if (maxHeap.size() > k) {
                sumQuality -= maxHeap.remove();
            }
            double groupRatio = worker.ratio();
            if (maxHeap.size() == k) {
                result = Math.min(sumQuality * groupRatio, result);
            }
        }
        return result;
    }

    static class Worker {
        int wage;
        int quality;

        double ratio() {
            return (double) wage / quality;
        }

        Worker(int wage, int quality) {
            this.wage = wage;
            this.quality = quality;
        }
    }
}
