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

    @Test
    void copyRandomList2() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        node1.random = node1;
        node2.next = null;
        node2.random = node2;
        assertThat(new Solution().copyRandomList(node1).toString(), equalTo("[[1,1],[2,1]]"));
    }

    @Test
    void copyRandomList3() {
        Node node31 = new Node(3);
        Node node32 = new Node(3);
        Node node33 = new Node(3);
        node31.next = node32;
        node31.random = null;
        node32.next = node33;
        node32.random = node31;
        node33.next = null;
        node33.random = null;
        assertThat(
                new Solution().copyRandomList(node31).toString(),
                equalTo("[[3,null],[3,0],[3,null]]"));
    }
}
