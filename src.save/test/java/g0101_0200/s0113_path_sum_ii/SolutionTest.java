package g0101_0200.s0113_path_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pathSum() {
        TreeNode root =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        assertThat(
                new Solution().pathSum(root, 22),
                equalTo(ArrayUtils.getLists(new int[][] {{5, 4, 11, 2}, {5, 8, 4, 5}})));
    }

    @Test
    void pathSum2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().pathSum(root, 5), equalTo(ArrayUtils.getLists(new int[][] {})));
    }

    @Test
    void pathSum3() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2));
        assertThat(new Solution().pathSum(root, 0), equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
