package g0601_0700.s0617_merge_two_binary_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeTrees() {
        TreeNode root1 = TreeNode.create(Arrays.asList(1, 3, 2, 5));
        TreeNode root2 = TreeNode.create(Arrays.asList(2, 1, 3, null, 4, null, 7));
        assertThat(new Solution().mergeTrees(root1, root2).toString(), equalTo("3,4,5,4,5,null,7"));
    }

    @Test
    void mergeTrees2() {
        TreeNode root1 = TreeNode.create(Arrays.asList(1));
        TreeNode root2 = TreeNode.create(Arrays.asList(1, 2));
        assertThat(new Solution().mergeTrees(root1, root2).toString(), equalTo("2,2,null"));
    }
}
