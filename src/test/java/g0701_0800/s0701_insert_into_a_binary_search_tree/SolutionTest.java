package g0701_0800.s0701_insert_into_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void insertIntoBST() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(4, 2, 7, 1, 3));
        TreeNode expected = TreeNode.create(Arrays.asList(4, 2, 7, 1, 3, 5));
        assertThat(
                new Solution().insertIntoBST(treeNode, 5).toString(), equalTo(expected.toString()));
    }

    @Test
    void insertIntoBST2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(40, 20, 60, 10, 30, 50, 70));
        TreeNode expected =
                TreeNode.create(Arrays.asList(40, 20, 60, 10, 30, 50, 70, null, null, 25));
        assertThat(
                new Solution().insertIntoBST(treeNode, 25).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void insertIntoBST3() {
        TreeNode treeNode =
                TreeNode.create(Arrays.asList(4, 2, 7, 1, 3, null, null, null, null, null, null));
        TreeNode expected = TreeNode.create(Arrays.asList(4, 2, 7, 1, 3, 5));
        assertThat(
                new Solution().insertIntoBST(treeNode, 5).toString(), equalTo(expected.toString()));
    }
}
