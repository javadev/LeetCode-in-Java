package g0101_0200.s0144_binary_tree_preorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void preorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        assertThat(new Solution().preorderTraversal(treeNode), equalTo(Arrays.asList(1, 2, 3)));
    }

    @Test
    void preorderTraversal2() {
        assertThat(new Solution().preorderTraversal(null), equalTo(Collections.emptyList()));
    }

    @Test
    void preorderTraversal3() {
        assertThat(
                new Solution().preorderTraversal(new TreeNode(1)),
                equalTo(Collections.singletonList(1)));
    }
}
