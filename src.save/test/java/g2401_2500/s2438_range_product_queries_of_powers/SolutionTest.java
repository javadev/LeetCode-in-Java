package g2401_2500.s2438_range_product_queries_of_powers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void productQueries() {
        assertThat(
                new Solution().productQueries(15, new int[][] {{0, 1}, {2, 2}, {0, 3}}),
                equalTo(new int[] {2, 4, 64}));
    }

    @Test
    void productQueries2() {
        assertThat(new Solution().productQueries(2, new int[][] {{0, 0}}), equalTo(new int[] {2}));
    }
}
