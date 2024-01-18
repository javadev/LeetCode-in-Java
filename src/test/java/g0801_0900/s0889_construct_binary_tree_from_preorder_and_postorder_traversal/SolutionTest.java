package g0801_0900.s0889_construct_binary_tree_from_preorder_and_postorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructFromPrePost() {
        assertThat(
                new Solution()
                        .constructFromPrePost(
                                new int[] {1, 2, 4, 5, 3, 6, 7}, new int[] {4, 5, 2, 6, 7, 3, 1})
                        .toString(),
                equalTo("1,2,4,5,3,6,7"));
    }

    @Test
    void constructFromPrePost2() {
        assertThat(
                new Solution().constructFromPrePost(new int[] {1}, new int[] {1}).toString(),
                equalTo("1"));
    }
}
