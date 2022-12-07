package g2101_2200.s2133_check_if_every_row_and_column_contains_all_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkValid() {
        assertThat(
                new Solution().checkValid(new int[][] {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}),
                equalTo(true));
    }

    @Test
    void checkValid2() {
        assertThat(
                new Solution().checkValid(new int[][] {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}}),
                equalTo(false));
    }
}
