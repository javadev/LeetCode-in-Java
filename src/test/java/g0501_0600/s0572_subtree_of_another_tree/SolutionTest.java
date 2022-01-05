package g0501_0600.s0572_subtree_of_another_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSubtree() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 1, 2));
        TreeNode subTree = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        assertThat(new Solution().isSubtree(treeNode, subTree), equalTo(true));
    }

    @Test
    void isSubtree2() {
        TreeNode treeNode =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(3, 4, 5, 1, 2, null, null, null, null, 0));
        TreeNode subTree = TreeUtils.constructBinaryTree(Arrays.asList(4, 1, 2));
        assertThat(new Solution().isSubtree(treeNode, subTree), equalTo(false));
    }
}
