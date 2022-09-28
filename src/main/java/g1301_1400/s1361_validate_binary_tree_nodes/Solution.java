package g1301_1400.s1361_validate_binary_tree_nodes;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Graph #Union_Find
// #2022_03_21_Time_8_ms_(69.78%)_Space_55.4_MB_(51.49%)

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDeg = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] >= 0) {
                inDeg[leftChild[i]] += 1;
            }
            if (rightChild[i] >= 0) {
                inDeg[rightChild[i]] += 1;
            }
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                if (queue.isEmpty()) {
                    queue.offer(i);
                } else {
                    // Violate rule 1.
                    return false;
                }
            }
            if (inDeg[i] > 1) {
                // Violate rule 2.
                return false;
            }
        }
        int tpLen = 0;
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            tpLen++;
            int left = leftChild[curNode];
            int right = rightChild[curNode];
            if (left > -1 && --inDeg[left] == 0) {
                queue.offer(left);
            }
            if (right > -1 && --inDeg[right] == 0) {
                queue.offer(right);
            }
        }
        return tpLen == n;
    }
}
