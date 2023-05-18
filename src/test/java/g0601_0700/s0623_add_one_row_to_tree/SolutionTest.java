package g0601_0700.s0623_add_one_row_to_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addOneRow() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(4, 2, 6, 3, 1, 5));
        TreeNode expected = TreeNode.create(Arrays.asList(4, 1, 1, 2, null, null, 6, 3, 1, 5));
        assertThat(
                new Solution().addOneRow(treeNode, 1, 2).toString(), equalTo(expected.toString()));
    }

    @Test
    void addOneRow2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(4, 2, null, 3, 1));
        TreeNode expected = TreeNode.create(Arrays.asList(4, 2, null, 1, 1, 3, null, null, 1));
        assertThat(
                new Solution().addOneRow(treeNode, 1, 3).toString(), equalTo(expected.toString()));
    }
}
