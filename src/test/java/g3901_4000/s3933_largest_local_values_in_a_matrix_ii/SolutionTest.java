package g3901_4000.s3933_largest_local_values_in_a_matrix_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countLocalMaximums() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{1, 2}, {3, 4}}), equalTo(1));
    }

    @Test
    void countLocalMaximums2() {
        assertThat(
                new Solution().countLocalMaximums(new int[][] {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}}),
                equalTo(5));
    }

    @Test
    void countLocalMaximums3() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{1, 1}, {1, 1}}), equalTo(4));
    }

    @Test
    void countLocalMaximums4() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{0, 0}, {0, 0}}), equalTo(0));
    }

    @Test
    void countLocalMaximums5() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{200}}), equalTo(1));
    }

    @Test
    void countLocalMaximums6() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{1, 0}, {0, 2}}), equalTo(2));
    }

    @Test
    void countLocalMaximums7() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{1, 2, 0}}), equalTo(1));
    }

    @Test
    void countLocalMaximums8() {
        assertThat(new Solution().countLocalMaximums(new int[][] {{1}, {0}, {2}}), equalTo(2));
    }
}
