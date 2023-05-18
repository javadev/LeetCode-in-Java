package g2401_2500.s2458_height_of_binary_tree_after_subtree_removal_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void treeQueries() {
        assertThat(
                new Solution()
                        .treeQueries(
                                TreeNode.create(
                                        Arrays.asList(
                                                1, 3, 4, 2, null, 6, 5, null, null, null, null,
                                                null, 7)),
                                new int[] {4}),
                equalTo(new int[] {2}));
    }

    @Test
    void treeQueries2() {
        assertThat(
                new Solution()
                        .treeQueries(
                                TreeNode.create(Arrays.asList(5, 8, 9, 2, 1, 3, 7, 4, 6)),
                                new int[] {3, 2, 4, 8}),
                equalTo(new int[] {3, 2, 3, 2}));
    }
}
