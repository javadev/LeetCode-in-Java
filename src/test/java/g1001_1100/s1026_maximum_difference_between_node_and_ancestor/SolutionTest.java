package g1001_1100.s1026_maximum_difference_between_node_and_ancestor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAncestorDiff() {
        TreeNode treeNode =
                TreeNode.create(Arrays.asList(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13));
        assertThat(new Solution().maxAncestorDiff(treeNode), equalTo(7));
    }

    @Test
    void maxAncestorDiff2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, null, 2, null, 0, 3));
        assertThat(new Solution().maxAncestorDiff(treeNode), equalTo(3));
    }
}
