package g1001_1100.s1080_insufficient_nodes_in_root_to_leaf_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sufficientSubset() {
        assertThat(
                new Solution()
                        .sufficientSubset(
                                TreeNode.create(
                                        Arrays.asList(
                                                1, 2, 3, 4, -99, -99, 7, 8, 9, -99, -99, 12, 13,
                                                -99, 14)),
                                1)
                        .toString(),
                equalTo("1,2,4,8,9,null,3,null,7,null,14"));
    }

    @Test
    void sufficientSubset2() {
        assertThat(
                new Solution()
                        .sufficientSubset(
                                TreeNode.create(
                                        Arrays.asList(
                                                5, 4, 8, 11, null, 17, 4, 7, 1, null, null, 5, 3)),
                                22)
                        .toString(),
                equalTo("5,4,11,7,null,null,8,17,4,5,null"));
    }

    @Test
    void sufficientSubset3() {
        assertThat(
                new Solution()
                        .sufficientSubset(
                                TreeNode.create(Arrays.asList(1, 2, -3, -5, null, 4, null)), -1)
                        .toString(),
                equalTo("1,null,-3,4,null"));
    }
}
