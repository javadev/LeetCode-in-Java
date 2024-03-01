package g0601_0700.s0662_maximum_width_of_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void widthOfBinaryTree() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 3, 2, 5, 3, null, 9));
        assertThat(new Solution().widthOfBinaryTree(treeNode), equalTo(4));
    }

    @Test
    void widthOfBinaryTree2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 3, null, 5, 3));
        assertThat(new Solution().widthOfBinaryTree(treeNode), equalTo(2));
    }

    @Test
    void widthOfBinaryTree3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 3, 2, 5));
        assertThat(new Solution().widthOfBinaryTree(treeNode), equalTo(2));
    }
}
