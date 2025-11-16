package g0101_0200.s0101_symmetric_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void symmetricTree() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertThat(new Solution().isSymmetric(root), equalTo(true));
    }

    @Test
    void symmetricTree2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertThat(new Solution().isSymmetric(root), equalTo(false));
    }

    @Test
    void symmetricTree3() {
        assertThat(new Solution().isSymmetric(null), equalTo(true));
    }

    @Test
    void symmetricTree4() {
        TreeNode root = new TreeNode(1);
        assertThat(new Solution().isSymmetric(root), equalTo(true));
    }

    @Test
    void symmetricTree5() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertThat(new Solution().isSymmetric(root), equalTo(false));
    }

    @Test
    void symmetricTree6() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        assertThat(new Solution().isSymmetric(root), equalTo(false));
    }

    @Test
    void symmetricTree7() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 4, 5, 3));
        assertThat(new Solution().isSymmetric(root), equalTo(false));
    }
}
