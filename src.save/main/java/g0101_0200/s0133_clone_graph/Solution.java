package g0101_0200.s0133_clone_graph;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Graph #Acceptance_47.9%
// #2022_02_22_Time_55_ms_(16.92%)_Space_43.2_MB_(24.32%)

import com_github_leetcode.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node cloneGraph(Node node) {
        return cloneGraph(node, new HashMap<>());
    }

    private Node cloneGraph(Node node, Map<Node, Node> processedNodes) {
        if (node == null) {
            return null;
        } else if (processedNodes.get(node) != null) {
            return processedNodes.get(node);
        }
        Node newNode = new Node();
        processedNodes.put(node, newNode);
        newNode.val = node.val;
        newNode.neighbors = new ArrayList<>();
        for (Node neighbor : node.neighbors) {
            Node clonedNeighbor = cloneGraph(neighbor, processedNodes);
            if (clonedNeighbor != null) {
                newNode.neighbors.add(clonedNeighbor);
            }
        }
        return newNode;
    }
}
