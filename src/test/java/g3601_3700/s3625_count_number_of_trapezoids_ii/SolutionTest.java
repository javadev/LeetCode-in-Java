package g3601_3700.s3625_count_number_of_trapezoids_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTrapezoids() {
        assertThat(
                new Solution()
                        .countTrapezoids(new int[][] {{-3, 2}, {3, 0}, {2, 3}, {3, 2}, {2, -3}}),
                equalTo(2));
    }

    @Test
    void countTrapezoids2() {
        assertThat(
                new Solution().countTrapezoids(new int[][] {{0, 0}, {1, 0}, {0, 1}, {2, 1}}),
                equalTo(1));
    }

    @Test
    void countTrapezoids3() {
        assertThat(
                new Solution()
                        .countTrapezoids(
                                new int[][] {
                                    {71, -89},
                                    {-75, -89},
                                    {-9, 11},
                                    {-24, -89},
                                    {-51, -89},
                                    {-77, -89},
                                    {42, 11}
                                }),
                equalTo(10));
    }
}
