package g2101_2200.s2140_solving_questions_with_brainpower;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostPoints() {
        assertThat(
                new Solution().mostPoints(new int[][] {{3, 2}, {4, 3}, {4, 4}, {2, 5}}),
                equalTo(5L));
    }

    @Test
    void mostPoints2() {
        assertThat(
                new Solution().mostPoints(new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}),
                equalTo(7L));
    }
}
