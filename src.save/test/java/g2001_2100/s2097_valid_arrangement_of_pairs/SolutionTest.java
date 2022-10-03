package g2001_2100.s2097_valid_arrangement_of_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validArrangement() {
        assertThat(
                new Solution().validArrangement(new int[][] {{5, 1}, {4, 5}, {11, 9}, {9, 4}}),
                equalTo(new int[][] {{11, 9}, {9, 4}, {4, 5}, {5, 1}}));
    }

    @Test
    void validArrangement2() {
        assertThat(
                new Solution().validArrangement(new int[][] {{1, 3}, {3, 2}, {2, 1}}),
                equalTo(new int[][] {{3, 2}, {2, 1}, {1, 3}}));
    }

    @Test
    void validArrangement3() {
        assertThat(
                new Solution().validArrangement(new int[][] {{1, 2}, {1, 3}, {2, 1}}),
                equalTo(new int[][] {{1, 2}, {2, 1}, {1, 3}}));
    }
}
