package g0501_0600.s0563_binary_tree_tilt;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTilt() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().findTilt(treeNode), equalTo(1));
    }

    @Test
    void findTilt2() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 9, 3, 5, null, 7));
        assertThat(new Solution().findTilt(treeNode), equalTo(15));
    }

    @Test
    void findTilt3() {
        TreeNode treeNode =
                TreeUtils.constructBinaryTree(Arrays.asList(21, 7, 14, 1, 1, 2, 2, 3, 3));
        assertThat(new Solution().findTilt(treeNode), equalTo(9));
    }
}
