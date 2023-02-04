package g0601_0700.s0700_search_in_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void searchBST() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        TreeNode expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertThat(new Solution().searchBST(root, 2).toString(), equalTo(expected.toString()));
    }

    @Test
    void searchBST2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        assertThat(new Solution().searchBST(root, 5), equalTo(null));
    }
}
