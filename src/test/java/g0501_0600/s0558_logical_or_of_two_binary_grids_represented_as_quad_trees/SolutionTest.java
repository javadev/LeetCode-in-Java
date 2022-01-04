package g0501_0600.s0558_logical_or_of_two_binary_grids_represented_as_quad_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intersect() {
        Node node1 = new Node(true, false);
        node1.topLeft = new Node(true, true);
        node1.topRight = new Node(true, true);
        node1.bottomLeft = new Node(false, true);
        node1.bottomRight = new Node(false, true);
        Node node2 = new Node(true, false);
        node2.topLeft = new Node(true, true);
        node2.topRight = new Node(true, false);
        node2.bottomLeft = new Node(true, true);
        node2.bottomRight = new Node(false, true);
        node2.topRight.topLeft = new Node(false, true);
        node2.topRight.topRight = new Node(false, true);
        node2.topRight.bottomLeft = new Node(true, true);
        node2.topRight.bottomRight = new Node(true, true);
        assertThat(
                new Solution().intersect(node1, node2).toString(),
                equalTo("[0,0][1,1][1,1][1,1][1,0]"));
    }
}
