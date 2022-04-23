package g1601_1700.s1611_minimum_one_bit_operations_to_make_integers_zero;

// #Hard #Dynamic_Programming #Bit_Manipulation #Memoization
// #2022_04_12_Time_1_ms_(88.24%)_Space_39.5_MB_(84.80%)

import java.util.LinkedList;

public class Solution {
    public int minimumOneBitOperations(int n) {
        return calc(calculateOneIndex(n));
    }

    private int calc(LinkedList<Integer> indices) {
        if (indices.isEmpty()) {
            return 0;
        }
        int index = indices.removeLast();
        return stepOfExp(index) - calc(indices);
    }

    private LinkedList<Integer> calculateOneIndex(int n) {
        LinkedList<Integer> result = new LinkedList<>();
        int index = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result.add(index);
            }
            n >>= 1;

            index++;
        }
        return result;
    }

    private int stepOfExp(int index) {
        int result = 1;
        while (index > 0) {
            result <<= 1;
            index--;
        }
        return result - 1;
    }
}
