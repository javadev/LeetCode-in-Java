package g2901_3000.s2906_construct_product_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructProductMatrix() {
        assertThat(
                new Solution().constructProductMatrix(new int[][] {{1, 2}, {3, 4}}),
                equalTo(new int[][] {{24, 12}, {8, 6}}));
    }

    @Test
    void constructProductMatrix2() {
        assertThat(
                new Solution().constructProductMatrix(new int[][] {{12345}, {2}, {1}}),
                equalTo(new int[][] {{2}, {0}, {0}}));
    }
}
