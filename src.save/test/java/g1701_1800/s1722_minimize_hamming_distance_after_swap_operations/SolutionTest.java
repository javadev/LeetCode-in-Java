package g1701_1800.s1722_minimize_hamming_distance_after_swap_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumHammingDistance() {
        assertThat(
                new Solution()
                        .minimumHammingDistance(
                                new int[] {1, 2, 3, 4},
                                new int[] {2, 1, 4, 5},
                                new int[][] {{0, 1}, {2, 3}}),
                equalTo(1));
    }

    @Test
    void minimumHammingDistance2() {
        assertThat(
                new Solution()
                        .minimumHammingDistance(
                                new int[] {5, 1, 2, 4, 3},
                                new int[] {1, 5, 4, 2, 3},
                                new int[][] {{0, 4}, {4, 2}, {1, 3}, {1, 4}}),
                equalTo(0));
    }

    @Test
    void minimumHammingDistance3() {
        assertThat(
                new Solution()
                        .minimumHammingDistance(
                                new int[] {1, 2, 3, 4}, new int[] {1, 3, 2, 4}, new int[][] {}),
                equalTo(2));
    }
}
