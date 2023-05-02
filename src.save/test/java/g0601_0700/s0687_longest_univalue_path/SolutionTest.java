package g0601_0700.s0687_longest_univalue_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestUnivaluePath() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 4, 5, 1, 1, 5));
        assertThat(new Solution().longestUnivaluePath(treeNode), equalTo(2));
    }

    @Test
    void longestUnivaluePath2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 4, 5, 4, 4, 5));
        assertThat(new Solution().longestUnivaluePath(treeNode), equalTo(2));
    }
}
