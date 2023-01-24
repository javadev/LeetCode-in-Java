package g2401_2500.s2476_closest_nodes_queries_in_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestNodes() {
        assertThat(
                new Solution()
                        .closestNodes(
                                TreeNode.create(
                                        Arrays.asList(
                                                6, 2, 13, 1, 4, 9, 15, null, null, null, null, null,
                                                null, 14)),
                                Arrays.asList(2, 5, 16)),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(2, 2), Arrays.asList(4, 6), Arrays.asList(15, -1))));
    }

    @Test
    void closestNodes2() {
        assertThat(
                new Solution()
                        .closestNodes(
                                TreeNode.create(Arrays.asList(4, null, 9)),
                                Collections.singletonList(3)),
                equalTo(Collections.singletonList(Arrays.asList(-1, 4))));
    }
}
