package g0501_0600.s0513_find_bottom_left_tree_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findBottomLeftValue() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertThat(new Solution().findBottomLeftValue(treeNode), equalTo(1));
    }

    @Test
    void findBottomLeftValue2() {
        TreeNode treeNode =
                TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, null, 7));
        assertThat(new Solution().findBottomLeftValue(treeNode), equalTo(7));
    }
}
