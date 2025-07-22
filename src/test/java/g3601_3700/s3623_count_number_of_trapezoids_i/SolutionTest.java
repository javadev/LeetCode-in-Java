package g3601_3700.s3623_count_number_of_trapezoids_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTrapezoids() {
        assertThat(
                new Solution()
                        .countTrapezoids(new int[][] {{1, 0}, {2, 0}, {3, 0}, {2, 2}, {3, 2}}),
                equalTo(3));
    }

    @Test
    void countTrapezoids2() {
        assertThat(
                new Solution().countTrapezoids(new int[][] {{0, 0}, {1, 0}, {0, 1}, {2, 1}}),
                equalTo(1));
    }
}
