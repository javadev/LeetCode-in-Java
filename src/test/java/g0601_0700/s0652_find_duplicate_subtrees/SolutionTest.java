package g0601_0700.s0652_find_duplicate_subtrees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDuplicateSubtrees() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, 4, null, 2, 4, null, null, 4));
        TreeNode item1 = TreeNode.create(Arrays.asList(2, 4));
        TreeNode item2 = TreeNode.create(Collections.singletonList(4));
        List<TreeNode> expected = Arrays.asList(item2, item1);
        assertThat(
                new Solution().findDuplicateSubtrees(treeNode).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void findDuplicateSubtrees2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(2, 2, 2, 3, null, 3, null));
        TreeNode item1 = TreeNode.create(Arrays.asList(2, 3));
        TreeNode item2 = TreeNode.create(Collections.singletonList(3));
        List<TreeNode> expected = Arrays.asList(item2, item1);
        assertThat(
                new Solution().findDuplicateSubtrees(treeNode).toString(),
                equalTo(expected.toString()));
    }
}
