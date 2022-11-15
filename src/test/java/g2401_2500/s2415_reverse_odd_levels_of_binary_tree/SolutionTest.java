package g2401_2500.s2415_reverse_odd_levels_of_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseOddLevels() {
        assertThat(
                new Solution()
                        .reverseOddLevels(TreeNode.create(Arrays.asList(2, 3, 5, 8, 13, 21, 34)))
                        .toString(),
                equalTo("2,5,8,13,3,21,34"));
    }

    @Test
    void reverseOddLevels2() {
        assertThat(
                new Solution()
                        .reverseOddLevels(TreeNode.create(Arrays.asList(7, 13, 11)))
                        .toString(),
                equalTo("7,11,13"));
    }
}
