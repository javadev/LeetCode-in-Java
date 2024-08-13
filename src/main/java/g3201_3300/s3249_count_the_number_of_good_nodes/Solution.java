package g3201_3300.s3249_count_the_number_of_good_nodes;

// #Medium #Tree #Depth_First_Search #2024_08_13_Time_34_ms_(100.00%)_Space_113.9_MB_(90.70%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int count = 0;

    public int countGoodNodes(int[][] edges) {
        int n = edges.length + 1;
        TNode[] nodes = new TNode[n];
        nodes[0] = new TNode(0);
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            if (nodes[b] != null && nodes[a] == null) {
                nodes[a] = new TNode(a);
                nodes[b].children.add(nodes[a]);
            } else {
                if (nodes[a] == null) {
                    nodes[a] = new TNode(a);
                }
                if (nodes[b] == null) {
                    nodes[b] = new TNode(b);
                }
                nodes[a].children.add(nodes[b]);
            }
        }
        sizeOfTree(nodes[0]);
        return count;
    }

    private int sizeOfTree(TNode node) {
        if (node.size > 0) {
            return node.size;
        }
        List<TNode> children = node.children;
        if (children.isEmpty()) {
            count++;
            node.size = 1;
            return 1;
        }
        int size = sizeOfTree(children.get(0));
        int sum = size;
        boolean goodNode = true;
        for (int i = 1; i < children.size(); ++i) {
            TNode child = children.get(i);
            if (size != sizeOfTree(child)) {
                goodNode = false;
            }
            sum += sizeOfTree(child);
        }
        if (goodNode) {
            count++;
        }
        sum++;
        node.size = sum;
        return sum;
    }

    private static class TNode {
        int val;
        int size;
        List<TNode> children;

        TNode(int val) {
            this.val = val;
            this.size = -1;
            this.children = new ArrayList<>();
        }
    }
}
