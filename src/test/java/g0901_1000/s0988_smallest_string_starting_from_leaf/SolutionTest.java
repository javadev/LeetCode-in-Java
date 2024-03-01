package g0901_1000.s0988_smallest_string_starting_from_leaf;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestFromLeaf() {
        assertThat(
                new Solution()
                        .smallestFromLeaf(
                                TreeUtils.constructBinaryTree(Arrays.asList(0, 1, 2, 3, 4, 3, 4))),
                equalTo("dba"));
    }

    @Test
    void smallestFromLeaf2() {
        assertThat(
                new Solution()
                        .smallestFromLeaf(
                                TreeUtils.constructBinaryTree(Arrays.asList(25, 1, 3, 1, 3, 0, 2))),
                equalTo("adz"));
    }

    @Test
    void smallestFromLeaf3() {
        assertThat(
                new Solution()
                        .smallestFromLeaf(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(2, 2, 1, null, 1, 0, null, 0))),
                equalTo("abc"));
    }
}
