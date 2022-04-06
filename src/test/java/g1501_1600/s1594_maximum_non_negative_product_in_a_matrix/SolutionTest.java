package g1501_1600.s1594_maximum_non_negative_product_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProductPath() {
        assertThat(
                new Solution()
                        .maxProductPath(new int[][] {{-1, -2, -3}, {-2, -3, -3}, {-3, -3, -2}}),
                equalTo(-1));
    }

    @Test
    void maxProductPath2() {
        assertThat(
                new Solution().maxProductPath(new int[][] {{1, -2, 1}, {1, -2, 1}, {3, -4, 1}}),
                equalTo(8));
    }

    @Test
    void maxProductPath3() {
        assertThat(new Solution().maxProductPath(new int[][] {{1, 3}, {0, -4}}), equalTo(0));
    }
}
