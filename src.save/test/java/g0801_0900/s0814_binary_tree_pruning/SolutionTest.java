package g0801_0900.s0814_binary_tree_pruning;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pruneTree() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, null, 0, 0, 1));
        TreeNode expected = TreeNode.create(Arrays.asList(1, null, 0, null, 1));
        assertThat(new Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()));
    }

    @Test
    void pruneTree2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 0, 1, 0, 0, 0, 1));
        TreeNode expected = TreeNode.create(Arrays.asList(1, null, 1, null, 1));
        assertThat(new Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()));
    }

    @Test
    void pruneTree3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 1, 0, 1, 1, 0, 1, 0));
        TreeNode expected = TreeNode.create(Arrays.asList(1, 1, 0, 1, 1, null, 1));
        assertThat(new Solution().pruneTree(treeNode).toString(), equalTo(expected.toString()));
    }
}
