package g2401_2500.s2497_maximum_star_sum_of_a_graph;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Graph
// #2023_02_12_Time_36_ms_(97.50%)_Space_90.1_MB_(69.28%)

import java.util.PriorityQueue;

@SuppressWarnings("unchecked")
public class Solution {
    private PriorityQueue<Integer>[] graphNodeIdToNodeValues;

    public int maxStarSum(int[] nodeValues, int[][] edges, int maxNumberOfEdges) {
        final int totalNodes = nodeValues.length;
        graphNodeIdToNodeValues = new PriorityQueue[totalNodes];
        for (int i = 0; i < totalNodes; ++i) {
            graphNodeIdToNodeValues[i] = new PriorityQueue<>();
        }
        for (int[] edge : edges) {
            addEdgeEndingWithValueOfNode(nodeValues, edge[0], edge[1], maxNumberOfEdges);
            addEdgeEndingWithValueOfNode(nodeValues, edge[1], edge[0], maxNumberOfEdges);
        }
        return calculateMaxStarSum(nodeValues, totalNodes);
    }

    private void addEdgeEndingWithValueOfNode(
            int[] nodeValues, int fromNode, int toNode, int maxNumberOfEdges) {
        if (nodeValues[toNode] > 0 && graphNodeIdToNodeValues[fromNode].size() < maxNumberOfEdges) {
            graphNodeIdToNodeValues[fromNode].add(nodeValues[toNode]);
        } else if (!graphNodeIdToNodeValues[fromNode].isEmpty()
                && graphNodeIdToNodeValues[fromNode].peek() < nodeValues[toNode]) {
            graphNodeIdToNodeValues[fromNode].poll();
            graphNodeIdToNodeValues[fromNode].add(nodeValues[toNode]);
        }
    }

    private int calculateMaxStarSum(int[] nodeValues, int totalNodes) {
        int maxStarSum = Integer.MIN_VALUE;
        for (int i = 0; i < totalNodes; ++i) {
            int sum = nodeValues[i];
            for (int value : graphNodeIdToNodeValues[i]) {
                sum += value;
            }
            maxStarSum = Math.max(maxStarSum, sum);
        }
        return maxStarSum;
    }
}
