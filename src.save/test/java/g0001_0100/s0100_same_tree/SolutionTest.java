package g0001_0100.s0100_same_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSameTree() {
        TreeNode p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeNode q = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().isSameTree(p, q), equalTo(true));
    }

    @Test
    void isSameTree2() {
        TreeNode p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        TreeNode q = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 2));
        assertThat(new Solution().isSameTree(p, q), equalTo(false));
    }

    @Test
    void isSameTree3() {
        TreeNode p = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 1));
        TreeNode q = TreeUtils.constructBinaryTree(Arrays.asList(1, 1, 2));
        assertThat(new Solution().isSameTree(p, q), equalTo(false));
    }
}
