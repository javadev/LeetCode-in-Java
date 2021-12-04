package g0101_0200.s0124_binary_tree_maximum_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxPathSum() {
        TreeNode treeNode = TreeNode.create(new int[] {1, 2, 3});
        assertThat(new Solution().findMaxPathSum(treeNode), equalTo(6));
    }
}
