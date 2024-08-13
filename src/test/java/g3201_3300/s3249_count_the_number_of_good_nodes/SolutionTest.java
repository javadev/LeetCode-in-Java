package g3201_3300.s3249_count_the_number_of_good_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodNodes() {
        assertThat(
                new Solution()
                        .countGoodNodes(
                                new int[][] {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}}),
                equalTo(7));
    }

    @Test
    void countGoodNodes2() {
        assertThat(
                new Solution()
                        .countGoodNodes(
                                new int[][] {
                                    {0, 1}, {1, 2}, {2, 3}, {3, 4}, {0, 5}, {1, 6}, {2, 7}, {3, 8}
                                }),
                equalTo(6));
    }
}
