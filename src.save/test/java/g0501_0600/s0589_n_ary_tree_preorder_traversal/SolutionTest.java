package g0501_0600.s0589_n_ary_tree_preorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Node;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void preorder() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = Arrays.asList(node3, node2, node4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node3.neighbors = Arrays.asList(node5, node6);
        assertThat(new Solution().preorder(node1), equalTo(Arrays.asList(1, 3, 5, 6, 2, 4)));
    }

    @Test
    void preorder2() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        Node node14 = new Node(14);
        node11.neighbors = Arrays.asList(node14);
        node7.neighbors = Arrays.asList(node11);
        node3.neighbors = Arrays.asList(node6, node7);
        node8.neighbors = Arrays.asList(node12);
        node4.neighbors = Arrays.asList(node8);
        node9.neighbors = Arrays.asList(node13);
        node5.neighbors = Arrays.asList(node9, node10);
        node1.neighbors = Arrays.asList(node2, node3, node4, node5);
        assertThat(
                new Solution().preorder(node1),
                equalTo(Arrays.asList(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10)));
    }

    @Test
    void preorder3() {
        assertThat(new Solution().preorder(null), equalTo(Arrays.asList()));
    }
}
