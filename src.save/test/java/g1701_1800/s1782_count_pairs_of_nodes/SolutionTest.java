package g1701_1800.s1782_count_pairs_of_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(
                new Solution()
                        .countPairs(
                                4,
                                new int[][] {{1, 2}, {2, 4}, {1, 3}, {2, 3}, {2, 1}},
                                new int[] {2, 3}),
                equalTo(new int[] {6, 5}));
    }

    @Test
    void countPairs2() {
        assertThat(
                new Solution()
                        .countPairs(
                                5,
                                new int[][] {
                                    {1, 5}, {1, 5}, {3, 4}, {2, 5}, {1, 3}, {5, 1}, {2, 3}, {2, 5}
                                },
                                new int[] {1, 2, 3, 4, 5}),
                equalTo(new int[] {10, 10, 9, 8, 6}));
    }
}
