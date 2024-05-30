package g3101_3200.s3160_find_the_number_of_distinct_colors_among_the_balls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void queryResults() {
        assertThat(
                new Solution().queryResults(4, new int[][] {{1, 4}, {2, 5}, {1, 3}, {3, 4}}),
                equalTo(new int[] {1, 2, 2, 3}));
    }

    @Test
    void queryResults2() {
        assertThat(
                new Solution()
                        .queryResults(4, new int[][] {{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}}),
                equalTo(new int[] {1, 2, 2, 3, 4}));
    }
}
