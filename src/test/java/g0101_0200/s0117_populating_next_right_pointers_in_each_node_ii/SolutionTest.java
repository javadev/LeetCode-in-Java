package g0101_0200.s0117_populating_next_right_pointers_in_each_node_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.left_right.Node;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void connect() {
        Node root =
                new Node(
                        1,
                        new Node(2, new Node(4), new Node(5), null),
                        new Node(3, new Node(6), new Node(7), null),
                        null);
        Node actual = new Solution().connect(root);
        assertThat(actual.next, equalTo(null));
        assertThat(actual.left.next, equalTo(actual.right));
        assertThat(actual.left.left.next, equalTo(actual.left.right));
        assertThat(actual.left.right.next, equalTo(actual.right.left));
        assertThat(actual.right.left.next, equalTo(actual.right.right));
        assertThat(actual.right.right.next, equalTo(null));
    }
}
