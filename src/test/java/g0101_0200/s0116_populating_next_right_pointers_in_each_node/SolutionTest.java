package g0101_0200.s0116_populating_next_right_pointers_in_each_node;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.left_right.Node;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void connect() {
        assertThat(new Solution().connect(null), equalTo(null));
    }

    @Test
    void connect2() {
        Node node =
                new Node(
                        1,
                        new Node(2, new Node(4), new Node(5), null),
                        new Node(3, new Node(6), new Node(7), null),
                        null);

        Node node7 = new Node(7);
        Node node6 = new Node(6, null, null, node7);
        Node node3 = new Node(3, node6, node7, null);
        Node node5 = new Node(5, null, null, node6);
        Node node4 = new Node(4, null, null, node5);
        Node node2 = new Node(2, node4, node5, node3);
        Node node1 = new Node(1, node2, node3, null);

        assertThat(new Solution().connect(node).toString(), equalTo(node1.toString()));
    }
}
