package g0101_0200.s0124_binary_tree_maximum_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPathSum() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3));
        assertThat(new Solution().maxPathSum(treeNode), equalTo(6));
    }

    @Test
    void maxPathSum2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(-10, 9, 20, null, null, 15, 7));
        assertThat(new Solution().maxPathSum(treeNode), equalTo(42));
    }
}
