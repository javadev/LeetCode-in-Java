package g1801_1900.s1825_finding_mk_average;

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Queue
// #2022_05_06_Time_83_ms_(60.59%)_Space_96.3_MB_(77.83%)

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeMap;

@SuppressWarnings("java:S2184")
public class MKAverage {
    private final double m;
    private final double k;
    private final double c;
    private double avg;
    private final Bst middle;
    private final Bst min;
    private final Bst max;
    private final Deque<Integer> q;

    public MKAverage(int m, int k) {
        this.m = m;
        this.k = k;
        this.c = m - k * 2;
        this.avg = 0;
        this.middle = new Bst();
        this.min = new Bst();
        this.max = new Bst();
        this.q = new ArrayDeque<>();
    }

    public void addElement(int num) {
        if (min.size < k) {
            min.add(num);
            q.offer(num);
            return;
        }
        if (max.size < k) {
            min.add(num);
            max.add(min.removeMax());
            q.offer(num);
            return;
        }

        if (num >= min.lastKey() && num <= max.firstKey()) {
            middle.add(num);
            avg += num / c;
        } else if (num < min.lastKey()) {
            min.add(num);
            int val = min.removeMax();
            middle.add(val);
            avg += val / c;
        } else if (num > max.firstKey()) {
            max.add(num);
            int val = max.removeMin();
            middle.add(val);
            avg += val / c;
        }

        q.offer(num);

        if (q.size() > m) {
            num = q.poll();
            if (middle.containsKey(num)) {
                avg -= num / c;
                middle.remove(num);
            } else if (min.containsKey(num)) {
                min.remove(num);
                int val = middle.removeMin();
                avg -= val / c;
                min.add(val);
            } else if (max.containsKey(num)) {
                max.remove(num);
                int val = middle.removeMax();
                avg -= val / c;
                max.add(val);
            }
        }
    }

    public int calculateMKAverage() {
        if (q.size() < m) {
            return -1;
        }
        return (int) avg;
    }

    static class Bst {
        TreeMap<Integer, Integer> map;
        int size;

        public Bst() {
            this.map = new TreeMap<>();
            this.size = 0;
        }

        void add(int num) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            size++;
        }

        void remove(int num) {
            int count = map.getOrDefault(num, 1) - 1;
            if (count > 0) {
                map.put(num, count);
            } else {
                map.remove(num);
            }
            size--;
        }

        int removeMin() {
            int key = map.firstKey();

            remove(key);

            return key;
        }

        int removeMax() {
            int key = map.lastKey();

            remove(key);

            return key;
        }

        boolean containsKey(int key) {
            return map.containsKey(key);
        }

        int firstKey() {
            return map.firstKey();
        }

        int lastKey() {
            return map.lastKey();
        }
    }
}
