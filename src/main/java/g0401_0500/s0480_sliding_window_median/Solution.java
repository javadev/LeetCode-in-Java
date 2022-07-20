package g0401_0500.s0480_sliding_window_median;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2022_07_20_Time_60_ms_(70.77%)_Space_56.3_MB_(17.95%)

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings("java:S3012")
public class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        int len = nums.length;
        double[] result = new double[len - k + 1];
        if (k == 1) {
            for (int i = 0; i < len; i++) {
                result[i] = nums[i];
            }
            return result;
        }
        Comparator<Integer> comparator =
                (a, b) ->
                        (nums[a] != nums[b]
                                ? Integer.compare(nums[a], nums[b])
                                : Integer.compare(a, b));
        TreeSet<Integer> smallNums = new TreeSet<>(comparator.reversed());
        TreeSet<Integer> largeNums = new TreeSet<>(comparator);
        for (int i = 0; i < len; i++) {
            if (i >= k) {
                removeElement(smallNums, largeNums, i - k);
            }
            addElement(smallNums, largeNums, i);
            if (i >= k - 1) {
                result[i - (k - 1)] = getMedian(smallNums, largeNums, nums);
            }
        }
        return result;
    }

    private void addElement(TreeSet<Integer> smallNums, TreeSet<Integer> largeNums, int idx) {
        smallNums.add(idx);
        largeNums.add(smallNums.pollFirst());
        if (smallNums.size() < largeNums.size()) {
            smallNums.add(largeNums.pollFirst());
        }
    }

    private void removeElement(TreeSet<Integer> smallNums, TreeSet<Integer> largeNums, int idx) {
        if (largeNums.contains(idx)) {
            largeNums.remove(idx);
            if (smallNums.size() == largeNums.size() + 2) {
                largeNums.add(smallNums.pollFirst());
            }
        } else {
            smallNums.remove(idx);
            if (smallNums.size() < largeNums.size()) {
                smallNums.add(largeNums.pollFirst());
            }
        }
    }

    private double getMedian(TreeSet<Integer> smallNums, TreeSet<Integer> largeNums, int[] nums) {
        if (smallNums.size() == largeNums.size()) {
            return ((double) nums[smallNums.first()] + nums[largeNums.first()]) / 2;
        }
        return nums[smallNums.first()];
    }
}
