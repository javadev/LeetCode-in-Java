package g0901_1000.s0979_distribute_coins_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCoins() {
        assertThat(
                new Solution()
                        .distributeCoins(TreeUtils.constructBinaryTree(Arrays.asList(3, 0, 0))),
                equalTo(2));
    }

    @Test
    void distributeCoins2() {
        assertThat(
                new Solution()
                        .distributeCoins(TreeUtils.constructBinaryTree(Arrays.asList(0, 3, 0))),
                equalTo(3));
    }

    @Test
    void distributeCoins3() {
        assertThat(
                new Solution()
                        .distributeCoins(
                                TreeUtils.constructBinaryTree(Arrays.asList(1, 0, 0, null, 3))),
                equalTo(4));
    }
}
