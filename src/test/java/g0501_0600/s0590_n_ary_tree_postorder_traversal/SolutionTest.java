package g0501_0600.s0590_n_ary_tree_postorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Node;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void postorder() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = Arrays.asList(node3, node2, node4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node3.neighbors = Arrays.asList(node5, node6);
        assertThat(new Solution().postorder(node1), equalTo(Arrays.asList(5, 6, 3, 2, 4, 1)));
    }
}
