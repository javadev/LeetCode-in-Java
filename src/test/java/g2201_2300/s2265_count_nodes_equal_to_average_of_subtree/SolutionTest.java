package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void averageOfSubtree() {
        assertThat(
                new Solution()
                        .averageOfSubtree(TreeNode.create(Arrays.asList(4, 8, 5, 0, 1, null, 6))),
                equalTo(5));
    }

    @Test
    void averageOfSubtree2() {
        assertThat(
                new Solution().averageOfSubtree(TreeNode.create(Collections.singletonList(1))),
                equalTo(1));
    }
}
