package g1301_1400.s1354_construct_target_array_with_multiple_sums;

// #Hard #Array #Heap_Priority_Queue #2022_03_21_Time_2_ms_(100.00%)_Space_56.7_MB_(76.64%)

public class Solution {
    public boolean isPossible(int[] target) {
        long sum = target[0];
        int maxIndex = 0;
        for (int i = 1; i < target.length; i++) {
            sum += target[i];
            if (target[i] > target[maxIndex]) {
                maxIndex = i;
            }
        }
        long remainingSum = sum - target[maxIndex];
        if (target[maxIndex] == 1 || remainingSum == 1) {
            return true;
        }
        if (remainingSum >= target[maxIndex]
                || remainingSum == 0
                || target[maxIndex] % remainingSum == 0) {
            return false;
        }
        target[maxIndex] %= remainingSum;
        return isPossible(target);
    }
}
