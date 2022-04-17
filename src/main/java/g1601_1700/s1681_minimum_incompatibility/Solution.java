package g1601_1700.s1681_minimum_incompatibility;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2022_04_17_Time_1_ms_(100.00%)_Space_39.8_MB_(97.56%)

import java.util.Arrays;

public class Solution {
    private static class Node {
        boolean[] visited;
        int size;
        int min;
        int max;

        Node() {
            visited = new boolean[17];
            min = 20;
            max = 0;
            size = 0;
        }
    }

    private Node[] nodes;
    private int size;
    private int result = 1_000_000;
    private int currentSum;

    public int minimumIncompatibility(int[] nums, int k) {
        size = nums.length / k;
        nodes = new Node[k];
        for (int i = 0; i < k; ++i) {
            nodes[i] = new Node();
        }
        Arrays.sort(nums);
        currentSum = 0;
        solve(nums, 0);
        return result == 1_000_000 ? -1 : result;
    }

    private void solve(int[] nums, int idx) {
        if (idx == nums.length) {
            result = currentSum;
            return;
        }
        int minSize = size;
        int prevMin;
        int prevMax;
        int diff;
        for (Node node : nodes) {
            if (node.size == minSize || node.visited[nums[idx]]) {
                continue;
            }
            minSize = node.size;
            prevMin = node.min;
            prevMax = node.max;
            diff = prevMax - prevMin;
            node.min = Math.min(node.min, nums[idx]);
            node.max = Math.max(node.max, nums[idx]);
            node.size++;
            node.visited[nums[idx]] = true;
            if (prevMin == 20) {
                currentSum += node.max - node.min;
            } else {
                currentSum += node.max - node.min - diff;
            }
            if (currentSum < result) {
                solve(nums, idx + 1);
            }
            if (prevMin == 20) {
                currentSum -= node.max - node.min;
            } else {
                currentSum -= node.max - node.min - diff;
            }
            node.visited[nums[idx]] = false;
            node.size--;
            node.min = prevMin;
            node.max = prevMax;
        }
    }
}
