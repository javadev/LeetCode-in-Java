package g0501_0600.s0530_minimum_absolute_difference_in_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMinimumDifference() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 1, 3));
        assertThat(new Solution().getMinimumDifference(treeNode), equalTo(1));
    }

    @Test
    void getMinimumDifference2() {
        TreeNode treeNode =
                TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 48, null, null, 12, 49));
        assertThat(new Solution().getMinimumDifference(treeNode), equalTo(1));
    }
}
