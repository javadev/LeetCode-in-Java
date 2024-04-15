package g1901_2000.s1976_number_of_ways_to_arrive_at_destination;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPaths() {
        assertThat(
                new Solution()
                        .countPaths(
                                7,
                                new int[][] {
                                    {0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3},
                                    {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}
                                }),
                equalTo(4));
    }

    @Test
    void countPaths2() {
        assertThat(new Solution().countPaths(2, new int[][] {{1, 0, 10}}), equalTo(1));
    }
}
