package g0101_0200.s0129_sum_root_to_leaf_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumNumbers() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3));
        assertThat(new Solution().sumNumbers(treeNode), equalTo(25));
    }

    @Test
    void sumNumbers2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(4, 9, 0, 5, 1));
        assertThat(new Solution().sumNumbers(treeNode), equalTo(1026));
    }
}
