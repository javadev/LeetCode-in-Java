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
                new Solution().reverseOddLevels(TreeNode.create(Arrays.asList(1))).toString(),
                equalTo("1"));
    }
}
