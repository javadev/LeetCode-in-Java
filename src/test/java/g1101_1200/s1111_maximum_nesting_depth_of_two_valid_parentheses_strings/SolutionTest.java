package g1101_1200.s1111_maximum_nesting_depth_of_two_valid_parentheses_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDepthAfterSplit() {
        assertThat(
                new Solution().maxDepthAfterSplit("(()())"), equalTo(new int[] {1, 0, 0, 0, 0, 1}));
    }

    @Test
    void maxDepthAfterSplit2() {
        assertThat(
                new Solution().maxDepthAfterSplit("()(())()"),
                equalTo(new int[] {1, 1, 1, 0, 0, 1, 1, 1}));
    }
}
