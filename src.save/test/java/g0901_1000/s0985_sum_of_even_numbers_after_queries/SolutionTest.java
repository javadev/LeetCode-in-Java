package g0901_1000.s0985_sum_of_even_numbers_after_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumEvenAfterQueries() {
        assertThat(
                new Solution()
                        .sumEvenAfterQueries(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}}),
                equalTo(new int[] {8, 6, 2, 4}));
    }

    @Test
    void sumEvenAfterQueries2() {
        assertThat(
                new Solution().sumEvenAfterQueries(new int[] {1}, new int[][] {{4, 0}}),
                equalTo(new int[] {0}));
    }
}
