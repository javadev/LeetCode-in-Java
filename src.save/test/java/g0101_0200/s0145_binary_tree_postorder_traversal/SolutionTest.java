package g0101_0200.s0145_binary_tree_postorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void postorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        assertThat(new Solution().postorderTraversal(treeNode), equalTo(Arrays.asList(3, 2, 1)));
    }

    @Test
    void postorderTraversal2() {
        assertThat(new Solution().postorderTraversal(null), equalTo(Collections.emptyList()));
    }

    @Test
    void postorderTraversal3() {
        assertThat(
                new Solution().postorderTraversal(new TreeNode(1)),
                equalTo(Collections.singletonList(1)));
    }
}
