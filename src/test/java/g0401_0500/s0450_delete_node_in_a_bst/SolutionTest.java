package g0401_0500.s0450_delete_node_in_a_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteNode() {
        TreeNode input = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        TreeNode expected = TreeNode.create(Arrays.asList(5, 4, 6, 2, null, null, 7));
        assertThat(new Solution().deleteNode(input, 3).toString(), equalTo(expected.toString()));
    }

    @Test
    void deleteNode2() {
        TreeNode input = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        TreeNode expected = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        assertThat(new Solution().deleteNode(input, 0).toString(), equalTo(expected.toString()));
    }
}
