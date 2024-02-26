package g1701_1800.s1786_number_of_restricted_paths_from_first_to_last_node;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRestrictedPaths() {
        assertThat(
                new Solution()
                        .countRestrictedPaths(
                                5,
                                new int[][] {
                                    {1, 2, 3},
                                    {1, 3, 3},
                                    {2, 3, 1},
                                    {1, 4, 2},
                                    {5, 2, 2},
                                    {3, 5, 1},
                                    {5, 4, 10}
                                }),
                equalTo(3));
    }

    @Test
    void countRestrictedPaths2() {
        assertThat(
                new Solution()
                        .countRestrictedPaths(
                                7,
                                new int[][] {
                                    {1, 3, 1}, {4, 1, 2}, {7, 3, 4}, {2, 5, 3}, {5, 6, 1},
                                    {6, 7, 2}, {7, 5, 3}, {2, 6, 4}
                                }),
                equalTo(1));
    }
}
