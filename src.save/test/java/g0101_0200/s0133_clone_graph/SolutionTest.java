package g0101_0200.s0133_clone_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Node;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cloneGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node1and2and4 = new Node(1, Arrays.asList(node2, node4));
        Node node2and1and3 = new Node(2, Arrays.asList(node1, node3));
        Node node3and2and4 = new Node(3, Arrays.asList(node2, node4));
        Node node4and1and3 = new Node(4, Arrays.asList(node1, node3));
        Node node =
                new Node(
                        5,
                        Arrays.asList(node1and2and4, node2and1and3, node3and2and4, node4and1and3));
        assertThat(
                new Solution().cloneGraph(node).toString(), equalTo("[[2,4],[1,3],[2,4],[1,3]]"));
    }

    @Test
    void cloneGraph2() {
        Node node1 = new Node(1);
        assertThat(new Solution().cloneGraph(node1).toString(), equalTo("[]"));
    }

    @Test
    void cloneGraph3() {
        assertThat(new Solution().cloneGraph(null), equalTo(null));
    }
}
