package g1601_1700.s1649_create_sorted_array_through_instructions;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_04_22_Time_35_ms_(100.00%)_Space_60.4_MB_(82.68%)

public class Solution {
    private static final long MODULO = (long) 1e9 + 7;

    public int createSortedArray(int[] instructions) {
        int maxValue = 0;
        for (int num : instructions) {
            maxValue = Math.max(maxValue, num);
        }
        int[] bit = new int[maxValue + 1];
        long cost = 0;
        for (int i = 0; i < instructions.length; i++) {
            updateBIT(bit, maxValue, instructions[i]);
            cost +=
                    Math.min(
                            queryBIT(bit, instructions[i] - 1),
                            1 + i - queryBIT(bit, instructions[i]));
        }
        return (int) (cost % MODULO);
    }

    private void updateBIT(int[] bit, int maxValue, int x) {
        while (x <= maxValue) {
            bit[x] += 1;
            x += x & -x;
        }
    }

    private int queryBIT(int[] bit, int x) {
        int sum = 0;
        while (x > 0) {
            sum += bit[x];
            x -= x & -x;
        }
        return sum;
    }
}
