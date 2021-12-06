package g0301_0400.s0337_house_robber_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rob() {
        TreeNode root =
                new TreeNode(
                        3,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(3, null, new TreeNode(1)));
        assertThat(new Solution().rob(root), equalTo(7));
    }

    @Test
    void rob2() {
        TreeNode root =
                new TreeNode(
                        3,
                        new TreeNode(4, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(5, null, new TreeNode(1)));
        assertThat(new Solution().rob(root), equalTo(9));
    }
}
