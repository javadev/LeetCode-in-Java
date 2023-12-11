package g2401_2500.s2471_minimum_number_of_operations_to_sort_a_binary_tree_by_level;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(
                new Solution()
                        .minimumOperations(
                                TreeNode.create(
                                        Arrays.asList(
                                                1, 4, 3, 7, 6, 8, 5, null, null, null, null, 9,
                                                null, 10))),
                equalTo(3));
    }

    @Test
    void minimumOperations2() {
        assertThat(
                new Solution()
                        .minimumOperations(TreeNode.create(Arrays.asList(1, 3, 2, 7, 6, 5, 4))),
                equalTo(3));
    }

    @Test
    void minimumOperations3() {
        assertThat(
                new Solution().minimumOperations(TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6))),
                equalTo(0));
    }
}
