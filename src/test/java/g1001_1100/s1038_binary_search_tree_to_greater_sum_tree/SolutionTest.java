package g1001_1100.s1038_binary_search_tree_to_greater_sum_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bstToGst() {
        TreeNode root =
                TreeNode.create(
                        Arrays.asList(
                                4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));
        TreeNode expected =
                TreeNode.create(
                        Arrays.asList(
                                30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null,
                                8));
        assertThat(new Solution().bstToGst(root).toString(), equalTo(expected.toString()));
    }

    @Test
    void bstToGst2() {
        TreeNode root = TreeNode.create(Arrays.asList(0, null, 1));
        TreeNode expected = TreeNode.create(Arrays.asList(1, null, 1));
        assertThat(new Solution().bstToGst(root).toString(), equalTo(expected.toString()));
    }
}
