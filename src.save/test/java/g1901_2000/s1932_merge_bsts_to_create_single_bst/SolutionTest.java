package g1901_2000.s1932_merge_bsts_to_create_single_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMerge() {
        List<TreeNode> nodes =
                Arrays.asList(
                        TreeNode.create(Arrays.asList(2, 1)),
                        TreeNode.create(Arrays.asList(3, 2, 5)),
                        TreeNode.create(Arrays.asList(5, 4)));
        assertThat(
                new Solution().canMerge(nodes).toString(),
                equalTo(TreeNode.create(Arrays.asList(3, 2, 5, 1, null, 4)).toString()));
    }

    @Test
    void canMerge2() {
        List<TreeNode> nodes =
                Arrays.asList(
                        TreeNode.create(Arrays.asList(5, 3, 8)),
                        TreeNode.create(Arrays.asList(3, 2, 6)));
        assertThat(
                new Solution().canMerge(nodes), equalTo(TreeNode.create(Collections.emptyList())));
    }

    @Test
    void canMerge3() {
        List<TreeNode> nodes =
                Arrays.asList(
                        TreeNode.create(Arrays.asList(5, 4)), TreeNode.create(Arrays.asList(3)));
        assertThat(
                new Solution().canMerge(nodes), equalTo(TreeNode.create(Collections.emptyList())));
    }
}
