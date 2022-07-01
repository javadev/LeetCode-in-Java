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
}
