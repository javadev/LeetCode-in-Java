package g0901_1000.s0971_flip_binary_tree_to_match_preorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flipMatchVoyage() {
        assertThat(
                new Solution()
                        .flipMatchVoyage(TreeNode.create(Arrays.asList(1, 2)), new int[] {2, 1}),
                equalTo(Arrays.asList(-1)));
    }

    @Test
    void flipMatchVoyage2() {
        assertThat(
                new Solution()
                        .flipMatchVoyage(
                                TreeNode.create(Arrays.asList(1, 2, 3)), new int[] {1, 3, 2}),
                equalTo(Arrays.asList(1)));
    }

    @Test
    void flipMatchVoyage3() {
        assertThat(
                new Solution()
                        .flipMatchVoyage(
                                TreeNode.create(Arrays.asList(1, 2, 3)), new int[] {1, 2, 3}),
                equalTo(Collections.emptyList()));
    }
}
