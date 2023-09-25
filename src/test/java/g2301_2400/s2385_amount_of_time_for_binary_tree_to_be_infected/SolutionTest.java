package g2301_2400.s2385_amount_of_time_for_binary_tree_to_be_infected;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void amountOfTime() {
        assertThat(
                new Solution()
                        .amountOfTime(
                                TreeNode.create(Arrays.asList(1, 5, 3, null, 4, 10, 6, 9, 2)), 3),
                equalTo(4));
    }

    @Test
    void amountOfTime2() {
        assertThat(new Solution().amountOfTime(TreeNode.create(Arrays.asList(1)), 1), equalTo(0));
    }

    @Test
    void amountOfTime3() {
        assertThat(
                new Solution()
                        .amountOfTime(
                                TreeNode.create(Arrays.asList(1, 2, null, 3, null, 4, null, 5)), 4),
                equalTo(3));
    }
}
