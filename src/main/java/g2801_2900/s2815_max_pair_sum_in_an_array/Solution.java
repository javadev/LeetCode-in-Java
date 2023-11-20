package g2801_2900.s2815_max_pair_sum_in_an_array;

// #Easy #Array #Hash_Table #2023_11_20_Time_8_ms_(67.30%)_Space_43.9_MB_(23.59%)

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int maxSum(int[] nums) {
        // what we'll return
        int maxSum = -1;
        Map<Integer, PriorityQueue<Integer>> maximumDigitToNumber = new HashMap<>();
        for (int i = 1; i <= 9; ++i) {
            maximumDigitToNumber.put(i, new PriorityQueue<>(Comparator.reverseOrder()));
        }
        for (int n : nums) {
            maximumDigitToNumber.get(getMaximumDigit(n)).add(n);
        }
        for (Map.Entry<Integer, PriorityQueue<Integer>> me : maximumDigitToNumber.entrySet()) {
            if (me.getValue().size() <= 1) {
                continue;
            }
            int sum = me.getValue().poll() + me.getValue().poll();
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    private int getMaximumDigit(int n) {
        int maxDigit = 1;
        for (int nMod10 = n % 10; n > 0; n /= 10, nMod10 = n % 10) {
            maxDigit = Math.max(maxDigit, nMod10);
        }
        return maxDigit;
    }
}
