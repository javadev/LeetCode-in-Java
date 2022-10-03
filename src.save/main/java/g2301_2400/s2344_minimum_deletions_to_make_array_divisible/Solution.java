package g2301_2400.s2344_minimum_deletions_to_make_array_divisible;

// #Hard #Array #Math #Sorting #Heap_Priority_Queue #Number_Theory
// #2022_07_19_Time_13_ms_(88.89%)_Space_77.2_MB_(77.78%)

public class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        int g = numsDivide[0];
        for (int i : numsDivide) {
            g = gcd(g, i);
        }
        int minOp = 0;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (g % num == 0) {
                smallest = Math.min(smallest, num);
            }
        }
        for (int num : nums) {
            if (num < smallest) {
                ++minOp;
            }
        }
        return smallest == Integer.MAX_VALUE ? -1 : minOp;
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
