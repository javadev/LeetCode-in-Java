package g1301_1400.s1372_longest_zigzag_path_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestZigZag() {
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(
                                1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1,
                                null, 1));
        assertThat(new Solution().longestZigZag(treeNode), equalTo(3));
    }

    @Test
    void longestZigZag2() {
        TreeNode treeNode =
                TreeNode.create(Arrays.asList(1, 1, 1, null, 1, null, null, 1, 1, null, 1));
        assertThat(new Solution().longestZigZag(treeNode), equalTo(4));
    }

    @Test
    void longestZigZag3() {
        TreeNode treeNode = TreeNode.create(Collections.singletonList(1));
        assertThat(new Solution().longestZigZag(treeNode), equalTo(0));
    }
}
