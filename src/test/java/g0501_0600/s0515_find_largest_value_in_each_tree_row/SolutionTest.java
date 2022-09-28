package g0501_0600.s0515_find_largest_value_in_each_tree_row;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestValues() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5, 3, null, 9));
        assertThat(new Solution().largestValues(treeNode), equalTo(Arrays.asList(1, 3, 9)));
    }

    @Test
    void largestValues2() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().largestValues(treeNode), equalTo(Arrays.asList(1, 3)));
    }
}
