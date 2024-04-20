package g0901_1000.s0993_cousins_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isCousins() {
        assertThat(
                new Solution()
                        .isCousins(TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4)), 4, 3),
                equalTo(false));
    }

    @Test
    void isCousins2() {
        assertThat(
                new Solution()
                        .isCousins(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(1, 2, 3, null, 4, null, 5)),
                                5,
                                4),
                equalTo(true));
    }

    @Test
    void isCousins3() {
        assertThat(
                new Solution()
                        .isCousins(
                                TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, null, 4)),
                                2,
                                3),
                equalTo(false));
    }
}
