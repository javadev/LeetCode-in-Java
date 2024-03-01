package g0201_0300.s0226_invert_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void invertTree() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3, 6, 9));
        assertThat(new Solution().invertTree(root).toString(), equalTo("4,7,9,6,2,3,1"));
    }

    @Test
    void invertTree2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertThat(new Solution().invertTree(root).toString(), equalTo("2,3,1"));
    }
}
