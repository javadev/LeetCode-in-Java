package g0401_0500.s0437_path_sum_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pathSum() {
        assertThat(
                new Solution()
                        .pathSum(
                                TreeNode.create(
                                        Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)),
                                8),
                equalTo(3));
    }

    @Test
    void pathSum2() {
        assertThat(
                new Solution()
                        .pathSum(
                                TreeNode.create(
                                        Arrays.asList(
                                                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)),
                                22),
                equalTo(3));
    }
}
