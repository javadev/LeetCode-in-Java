package g4001_4100.s4033_valid_k_unique_subarrays_i;

// #Hard #Array #Hash_Table #Bit_Manipulation #Prefix_Sum #Sliding_Window #Segment_Tree
// #Hash_Function #Binary_Indexed_Tree #Senior_Staff #Weekly_Contest_516
// #2026_11_25_Time_20_ms_(100.00%)_Space_235.47_MB_(70.27%)

import java.util.Arrays;

public class Solution {
    private int countOdd;
    private int countDistinct;

    public boolean[] validSubarrays(int[] nums, int k, int[][] queries) {
        int maxNum = Integer.MIN_VALUE;
        int[] prefixXor = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
            prefixXor[i + 1] = prefixXor[i] ^ nums[i];
        }
        int[][] sortedQueries = new int[queries.length][];
        int queriesCount = this.sortQueries(nums, k, prefixXor, queries, sortedQueries);
        boolean[] result = new boolean[queries.length];
        if (queriesCount == 0) {
            return result;
        }
        int currentLeft = sortedQueries[0][0];
        int currentRight = sortedQueries[0][0] - 1;
        countOdd = 0;
        countDistinct = 0;
        int[] counts = new int[maxNum + 1];
        for (int i = 0; i < queriesCount; i++) {
            int[] query = sortedQueries[i];
            while (currentLeft > query[0]) {
                this.add(counts, nums, --currentLeft);
            }
            while (currentRight < query[1]) {
                this.add(counts, nums, ++currentRight);
            }
            while (currentLeft < query[0]) {
                this.remove(counts, nums, currentLeft++);
            }
            while (currentRight > query[1]) {
                this.remove(counts, nums, currentRight--);
            }
            result[query[2]] = countDistinct == k && countOdd == 0;
        }
        return result;
    }

    private int sortQueries(
            int[] nums, int k, int[] prefixXor, int[][] queries, int[][] sortedQueries) {
        int blockSize = Math.max(1, (int) (nums.length / Math.sqrt(queries.length)));
        int queriesCount = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int length = query[1] - query[0];
            if (length % 2 == 1
                    && length + 1 >= 2 * k
                    && (prefixXor[query[1] + 1] ^ prefixXor[query[0]]) == 0) {
                sortedQueries[queriesCount++] =
                        new int[] {query[0], query[1], i, query[0] / blockSize};
            }
        }
        Arrays.sort(
                sortedQueries,
                0,
                queriesCount,
                (o1, o2) -> {
                    if (o1[3] == o2[3]) {
                        return o1[3] % 2 == 0 ? o1[1] - o2[1] : o2[1] - o1[1];
                    } else {
                        return Integer.compare(o1[3], o2[3]);
                    }
                });
        return queriesCount;
    }

    private void add(int[] counts, int[] nums, int index) {
        int count = ++counts[nums[index]];
        if (count == 1) {
            countDistinct++;
        }
        countOdd += 2 * (count & 1) - 1;
    }

    private void remove(int[] counts, int[] nums, int index) {
        int count = --counts[nums[index]];
        if (count == 0) {
            countDistinct--;
        }
        countOdd += 2 * (count & 1) - 1;
    }
}
