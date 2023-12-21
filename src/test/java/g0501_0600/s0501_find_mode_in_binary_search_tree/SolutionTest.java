package g0501_0600.s0501_find_mode_in_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(2);
        int[] expected = new int[] {2};
        assertThat(new Solution().findMode(treeNode), equalTo(expected));
    }

    @Test
    void findMode2() {
        TreeNode treeNode = new TreeNode(0);
        int[] expected = new int[] {0};
        assertThat(new Solution().findMode(treeNode), equalTo(expected));
    }
}
