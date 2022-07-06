package g0101_0200.s0133_clone_graph;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Graph #Udemy_Graph
// #2022_06_24_Time_45_ms_(29.80%)_Space_42.7_MB_(77.96%)

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
