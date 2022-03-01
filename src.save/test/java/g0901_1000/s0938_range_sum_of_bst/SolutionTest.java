package g0901_1000.s0938_range_sum_of_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rangeSumBST() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(10, 5, 15, 3, 7, null, 18));
        assertThat(new Solution().rangeSumBST(treeNode, 7, 15), equalTo(32));
    }

    @Test
    void rangeSumBST2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6));
        assertThat(new Solution().rangeSumBST(treeNode, 6, 10), equalTo(23));
    }
}
