package g1301_1400.s1315_sum_of_nodes_with_even_valued_grandparent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumEvenGrandparent() {
        TreeNode root =
                TreeNode.create(
                        Arrays.asList(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5));
        assertThat(new Solution().sumEvenGrandparent(root), equalTo(18));
    }

    @Test
    void sumEvenGrandparent2() {
        TreeNode root = TreeNode.create(Collections.singletonList(1));
        assertThat(new Solution().sumEvenGrandparent(root), equalTo(0));
    }
}
