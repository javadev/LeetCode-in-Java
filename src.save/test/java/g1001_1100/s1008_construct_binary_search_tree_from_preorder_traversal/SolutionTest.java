package g1001_1100.s1008_construct_binary_search_tree_from_preorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bstFromPreorder() {
        assertThat(
                new Solution().bstFromPreorder(new int[] {8, 5, 1, 7, 10, 12}).toString(),
                equalTo(TreeNode.create(Arrays.asList(8, 5, 10, 1, 7, null, 12)).toString()));
    }

    @Test
    void bstFromPreorder2() {
        assertThat(
                new Solution().bstFromPreorder(new int[] {1, 3}).toString(),
                equalTo(TreeNode.create(Arrays.asList(1, null, 3)).toString()));
    }
}
