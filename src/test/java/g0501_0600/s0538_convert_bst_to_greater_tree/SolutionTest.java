package g0501_0600.s0538_convert_bst_to_greater_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertBST() {
        TreeNode treeNode =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(
                                4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));
        TreeNode expected =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(
                                30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null,
                                8));
        assertThat(new Solution().convertBST(treeNode).toString(), equalTo(expected.toString()));
    }

    @Test
    void convertBST2() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(0, null, 1));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(1, null, 1));
        assertThat(new Solution().convertBST(treeNode).toString(), equalTo(expected.toString()));
    }
}
