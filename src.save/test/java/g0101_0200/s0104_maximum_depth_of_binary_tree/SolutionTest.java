package g0101_0200.s0104_maximum_depth_of_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDepthBinaryTree() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(new Solution().maxDepth(root), equalTo(3));
    }

    @Test
    void maxDepthBinaryTree2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        assertThat(new Solution().maxDepth(root), equalTo(2));
    }
}
