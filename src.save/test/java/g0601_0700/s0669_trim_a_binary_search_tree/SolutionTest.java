package g0601_0700.s0669_trim_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trimBST() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 0, 2));
        TreeNode expected = TreeNode.create(Arrays.asList(1, null, 2));
        assertThat(new Solution().trimBST(treeNode, 1, 2).toString(), equalTo(expected.toString()));
    }

    @Test
    void trimBST2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(3, 0, 4, null, 2, null, null, 1));
        TreeNode expected = TreeNode.create(Arrays.asList(3, 2, null, 1));
        assertThat(new Solution().trimBST(treeNode, 1, 3).toString(), equalTo(expected.toString()));
    }
}
