package g3601_3700.s3619_count_islands_with_total_value_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countIslands() {
        assertThat(
                new Solution()
                        .countIslands(
                                new int[][] {
                                    {0, 2, 1, 0, 0},
                                    {0, 5, 0, 0, 5},
                                    {0, 0, 1, 0, 0},
                                    {0, 1, 4, 7, 0},
                                    {0, 2, 0, 0, 8}
                                },
                                5),
                equalTo(2));
    }

    @Test
    void countIslands2() {
        assertThat(
                new Solution()
                        .countIslands(new int[][] {{3, 0, 3, 0}, {0, 3, 0, 3}, {3, 0, 3, 0}}, 3),
                equalTo(6));
    }
}
