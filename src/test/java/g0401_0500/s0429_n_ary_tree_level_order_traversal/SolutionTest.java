package g0401_0500.s0429_n_ary_tree_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void levelOrder() {
        Node root = new Node(1);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        root.neighbors = Arrays.asList(node3, node2, node4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node3.neighbors = Arrays.asList(node5, node6);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(3, 2, 4));
        expected.add(Arrays.asList(5, 6));
        assertThat(new Solution().levelOrder(root).toString(), equalTo(expected.toString()));
    }

    @Test
    void levelOrder2() {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        root.neighbors = Arrays.asList(node2, node3, node4, node5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node3.neighbors = Arrays.asList(node6, node7);
        Node node11 = new Node(11);
        node7.neighbors = Arrays.asList(node11);
        Node node14 = new Node(14);
        node11.neighbors = Arrays.asList(node14);
        Node node8 = new Node(8);
        node4.neighbors = Arrays.asList(node8);
        Node node12 = new Node(12);
        node8.neighbors = Arrays.asList(node12);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        node5.neighbors = Arrays.asList(node9, node10);
        Node node13 = new Node(13);
        node9.neighbors = Arrays.asList(node13);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2, 3, 4, 5));
        expected.add(Arrays.asList(6, 7, 8, 9, 10));
        expected.add(Arrays.asList(11, 12, 13));
        expected.add(Arrays.asList(14));
        assertThat(new Solution().levelOrder(root).toString(), equalTo(expected.toString()));
    }
}
