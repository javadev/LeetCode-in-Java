package g1301_1400.s1373_maximum_sum_bst_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumBST() {
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(
                                1, 4, 3, 2, 4, 2, 5, null, null, null, null, null, null, 4, 6));
        assertThat(new Solution().maxSumBST(treeNode), equalTo(20));
    }

    @Test
    void maxSumBST2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(4, 3, null, 1, 2));
        assertThat(new Solution().maxSumBST(treeNode), equalTo(2));
    }

    @Test
    void maxSumBST3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(-4, -2, -5));
        assertThat(new Solution().maxSumBST(treeNode), equalTo(0));
    }
}
