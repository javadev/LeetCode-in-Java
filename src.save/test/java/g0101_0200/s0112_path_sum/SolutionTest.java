package g0101_0200.s0112_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasPathSum() {
        TreeNode root =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1));
        assertThat(new Solution().hasPathSum(root, 22), equalTo(true));
    }

    @Test
    void hasPathSum2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().hasPathSum(root, 22), equalTo(false));
    }

    @Test
    void hasPathSum3() {
        assertThat(new Solution().hasPathSum(null, 0), equalTo(false));
    }
}
