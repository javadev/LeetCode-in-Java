package g1101_1200.s1110_delete_nodes_and_return_forest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void delNodes() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        assertThat(
                new Solution().delNodes(root, new int[] {3, 5}).toString(),
                equalTo(
                        Arrays.asList(
                                        TreeNode.create(Arrays.asList(1, 2, null, 4)),
                                        TreeNode.create(Collections.singletonList(6)),
                                        TreeNode.create(Collections.singletonList(7)))
                                .toString()));
    }

    @Test
    void delNodes2() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 2, 4, null, 3));
        assertThat(
                new Solution().delNodes(root, new int[] {3}).toString(),
                equalTo(
                        Collections.singletonList(TreeNode.create(Arrays.asList(1, 2, 4)))
                                .toString()));
    }
}
