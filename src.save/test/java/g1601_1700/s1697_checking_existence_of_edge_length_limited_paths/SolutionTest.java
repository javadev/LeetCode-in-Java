package g1601_1700.s1697_checking_existence_of_edge_length_limited_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distanceLimitedPathsExist() {
        assertThat(
                new Solution()
                        .distanceLimitedPathsExist(
                                3,
                                new int[][] {{0, 1, 2}, {1, 2, 4}, {2, 0, 8}, {1, 0, 16}},
                                new int[][] {{0, 1, 2}, {0, 2, 5}}),
                equalTo(new boolean[] {false, true}));
    }

    @Test
    void distanceLimitedPathsExist2() {
        assertThat(
                new Solution()
                        .distanceLimitedPathsExist(
                                5,
                                new int[][] {{0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}},
                                new int[][] {{0, 4, 14}, {1, 4, 13}}),
                equalTo(new boolean[] {true, false}));
    }
}
