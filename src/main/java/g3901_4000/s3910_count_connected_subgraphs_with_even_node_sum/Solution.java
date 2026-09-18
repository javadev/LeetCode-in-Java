package g3901_4000.s3910_count_connected_subgraphs_with_even_node_sum;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Bit_Manipulation #Union_Find #Enumeration
// #Senior_Staff #Graph_Theory #Biweekly_Contest_181
// #2026_09_18_Time_2_ms_(100.00%)_Space_46.57_MB_(85.71%)

public class Solution {
    private long[] graph;
    private int[] nums;
    private int validCount;

    public int evenSumSubgraphs(int[] nums, int[][] edges) {
        this.nums = nums;
        int nodeCount = nums.length;
        this.graph = new long[nodeCount];
        this.validCount = 0;
        buildGraph(edges);
        for (int root = 0; root < nodeCount; root++) {
            long rootMask = 1L << root;
            long allowedMask = -(1L << root);
            long candidateMask = graph[root] & allowedMask;
            search(rootMask, candidateMask, 0L, nums[root] & 1, allowedMask);
        }
        return validCount;
    }

    private void buildGraph(int[][] edgeList) {
        for (int[] edge : edgeList) {
            int firstNode = edge[0];
            int secondNode = edge[1];
            graph[firstNode] |= 1L << secondNode;
            graph[secondNode] |= 1L << firstNode;
        }
    }

    private void search(
            long selectedMask,
            long candidateMask,
            long excludedMask,
            int parity,
            long allowedMask) {
        if (parity == 0) {
            validCount++;
        }
        while (candidateMask != 0) {
            long currentBit = candidateMask & -candidateMask;
            int currentNode = Long.numberOfTrailingZeros(currentBit);
            candidateMask ^= currentBit;
            long nextSelectedMask = selectedMask | currentBit;
            long nextCandidateMask =
                    candidateMask
                            | (graph[currentNode]
                                    & allowedMask
                                    & ~nextSelectedMask
                                    & ~excludedMask);
            search(
                    nextSelectedMask,
                    nextCandidateMask,
                    excludedMask,
                    parity ^ (nums[currentNode] & 1),
                    allowedMask);
            excludedMask |= currentBit;
        }
    }
}
