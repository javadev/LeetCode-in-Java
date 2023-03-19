package g1401_1500.s1457_pseudo_palindromic_paths_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pseudoPalindromicPaths() {
        TreeNode root = TreeNode.create(Arrays.asList(2, 3, 1, 3, 1, null, 1));
        assertThat(new Solution().pseudoPalindromicPaths(root), equalTo(2));
    }

    @Test
    void pseudoPalindromicPaths2() {
        TreeNode root =
                TreeNode.create(Arrays.asList(2, 1, 1, 1, 3, null, null, null, null, null, 1));
        assertThat(new Solution().pseudoPalindromicPaths(root), equalTo(1));
    }

    @Test
    void pseudoPalindromicPaths3() {
        TreeNode root = TreeNode.create(Arrays.asList(9));
        assertThat(new Solution().pseudoPalindromicPaths(root), equalTo(1));
    }
}
