package g1401_1500.s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows;

// #Hard #Array #Binary_Search #Matrix #Heap_Priority_Queue
// #2022_03_28_Time_40_ms_(75.79%)_Space_54.2_MB_(53.31%)

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeSet;

public class Solution {
    public int kthSmallest(int[][] mat, int k) {
        TreeSet<int[]> treeSet =
                new TreeSet<>(
                        (o1, o2) -> {
                            if (o1[0] != o2[0]) {
                                return o1[0] - o2[0];
                            } else {
                                for (int i = 1; i < o1.length; i++) {
                                    if (o1[i] != o2[i]) {
                                        return o1[i] - o2[i];
                                    }
                                }
                                return 0;
                            }
                        });
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        int[] entry = new int[m + 1];
        for (int[] ints : mat) {
            sum += ints[0];
        }
        entry[0] = sum;
        treeSet.add(entry);
        int count = 0;
        while (count < k) {
            int[] curr = treeSet.pollFirst();
            count++;
            if (count == k) {
                return Objects.requireNonNull(curr)[0];
            }
            for (int i = 0; i < m; i++) {
                int[] next = Arrays.copyOf(Objects.requireNonNull(curr), curr.length);
                if (curr[i + 1] + 1 < n) {
                    next[0] -= mat[i][curr[i + 1]];
                    next[0] += mat[i][curr[i + 1] + 1];
                    next[i + 1]++;
                    treeSet.add(next);
                }
            }
        }
        return -1;
    }
}
