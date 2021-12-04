package g0101_0200.s0138_copy_list_with_random_pointer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.random.Node;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void copyRandomList() {
        Node node7 = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);
        node7.next = node13;
        node13.next = node11;
        node11.next = node10;
        node10.next = node1;
        node1.next = null;
        node7.random = null;
        node13.random = node7;
        node11.random = node1;
        node10.random = node11;
        node1.random = node7;
        assertThat(
                new Solution().copyRandomList(node7).toString(),
                equalTo("[[7,null],[13,0],[11,4],[10,2],[1,0]]"));
    }
}
