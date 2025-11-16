package g0801_0900.s0863_all_nodes_distance_k_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distanceK() {
        assertThat(
                new Solution()
                        .distanceK(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)),
                                new TreeNode(5),
                                2),
                equalTo(Arrays.asList(7, 4, 1)));
    }

    @Test
    void distanceK2() {
        assertThat(
                new Solution()
                        .distanceK(
                                TreeUtils.constructBinaryTree(Arrays.asList(1)),
                                new TreeNode(1),
                                3),
                equalTo(Collections.emptyList()));
    }

    @Test
    void distanceK3() {
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(
                new Solution().distanceK(root, new TreeNode(3), 2),
                equalTo(Arrays.asList(6, 2, 0, 8)));
    }

    @Test
    void distanceK4() {
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        assertThat(new Solution().distanceK(root, new TreeNode(7), 1), equalTo(Arrays.asList(2)));
    }

    @Test
    void distanceK5() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(new Solution().distanceK(root, new TreeNode(2), 0), equalTo(Arrays.asList(2)));
    }

    @Test
    void distanceK6() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        assertThat(
                new Solution().distanceK(root, new TreeNode(1), 5),
                equalTo(Collections.emptyList()));
    }

    @Test
    void distanceK7() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, null, 3, null, 4));
        assertThat(new Solution().distanceK(root, new TreeNode(2), 2), equalTo(Arrays.asList(4)));
    }
}
