package g1301_1400.s1305_all_elements_in_two_binary_search_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getAllElements() {
        assertThat(
                new Solution()
                        .getAllElements(
                                TreeNode.create(Arrays.asList(2, 1, 4)),
                                TreeNode.create(Arrays.asList(1, 0, 3))),
                equalTo(Arrays.asList(0, 1, 1, 2, 3, 4)));
    }

    @Test
    void getAllElements2() {
        assertThat(
                new Solution()
                        .getAllElements(
                                TreeNode.create(Arrays.asList(1, null, 8)),
                                TreeNode.create(Arrays.asList(8, 1))),
                equalTo(Arrays.asList(1, 1, 8, 8)));
    }
}
