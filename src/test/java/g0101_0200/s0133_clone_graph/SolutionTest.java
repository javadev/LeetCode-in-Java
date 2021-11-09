package g0101_0200.s0133_clone_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Node;
import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void cloneGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node1_2_4 = new Node(1, Arrays.asList(node2, node4));
        Node node2_1_3 = new Node(2, Arrays.asList(node1, node3));
        Node node3_2_4 = new Node(3, Arrays.asList(node2, node4));
        Node node4_1_3 = new Node(4, Arrays.asList(node1, node3));
        Node node = new Node(5, Arrays.asList(node1_2_4, node2_1_3, node3_2_4, node4_1_3));
        assertThat(
                new Solution().cloneGraph(node).toString(), equalTo("[[2,4],[1,3],[2,4],[1,3]]"));
    }
}
