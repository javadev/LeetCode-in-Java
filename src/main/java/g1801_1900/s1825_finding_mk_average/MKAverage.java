package g1801_1900.s1825_finding_mk_average;

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Queue
// #2025_03_13_Time_37_ms_(100.00%)_Space_100.84_MB_(46.09%)

import java.util.LinkedList;
import java.util.TreeSet;

public class MKAverage {
    private final int capacity;
    private final int boundary;
    private final int[] nums;
    private final TreeSet<Integer> numSet;
    private final LinkedList<Integer> order;

    public MKAverage(int m, int k) {
        this.capacity = m;
        this.boundary = k;
        nums = new int[100001];
        numSet = new TreeSet<>();
        order = new LinkedList<>();
    }

    public void addElement(int num) {
        if (order.size() == capacity) {
            int numToDelete = order.removeFirst();
            nums[numToDelete] = nums[numToDelete] - 1;
            if (nums[numToDelete] == 0) {
                numSet.remove(numToDelete);
            }
        }
        nums[num]++;
        numSet.add(num);
        order.add(num);
    }

    public int calculateMKAverage() {
        if (order.size() == capacity) {
            int skipCount = boundary;
            int numsCount = capacity - 2 * boundary;
            int freq = capacity - 2 * boundary;
            int sum = 0;
            for (int num : numSet) {
                int count = nums[num];
                if (skipCount < 0) {
                    sum += num * Math.min(count, numsCount);
                    numsCount -= Math.min(count, numsCount);
                } else {
                    skipCount -= count;
                    if (skipCount < 0) {
                        sum += num * Math.min(Math.abs(skipCount), numsCount);
                        numsCount -= Math.min(Math.abs(skipCount), numsCount);
                    }
                }
                if (numsCount == 0) {
                    break;
                }
            }
            return sum / freq;
        }
        return -1;
    }
}

/*
 * Your MKAverage object will be instantiated and called as such:
 * MKAverage obj = new MKAverage(m, k);
 * obj.addElement(num);
 * int param_2 = obj.calculateMKAverage();
 */
