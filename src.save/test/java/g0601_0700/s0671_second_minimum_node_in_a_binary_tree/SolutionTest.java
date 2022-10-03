package g0601_0700.s0671_second_minimum_node_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSecondMinimumValue() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(2, 2, 5, null, null, 5, 7));
        assertThat(new Solution().findSecondMinimumValue(treeNode), equalTo(5));
    }

    @Test
    void findSecondMinimumValue2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(2, 2, 2));
        assertThat(new Solution().findSecondMinimumValue(treeNode), equalTo(-1));
    }
}
