package g0801_0900.s0872_leaf_similar_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leafSimilar() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 6, 2, 7, 4, 1, 9, 8));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 6, 2, 7, 4, 1, 9, 8));
        assertThat(new Solution().leafSimilar(root1, root2), equalTo(true));
    }

    @Test
    void leafSimilar2() {
        TreeNode root1 =
                TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4));
        TreeNode root2 =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(
                                3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8));
        assertThat(new Solution().leafSimilar(root1, root2), equalTo(true));
    }

    @Test
    void leafSimilar3() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2));
        assertThat(new Solution().leafSimilar(root1, root2), equalTo(false));
    }
}
