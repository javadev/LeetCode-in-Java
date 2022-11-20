package g2401_2500.s2421_number_of_good_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfGoodPaths() {
        assertThat(
                new Solution()
                        .numberOfGoodPaths(
                                new int[] {1, 3, 2, 1, 3},
                                new int[][] {{0, 1}, {0, 2}, {2, 3}, {2, 4}}),
                equalTo(6));
    }

    @Test
    void numberOfGoodPaths2() {
        assertThat(
                new Solution()
                        .numberOfGoodPaths(
                                new int[] {1, 1, 2, 2, 3},
                                new int[][] {{0, 1}, {1, 2}, {2, 3}, {2, 4}}),
                equalTo(7));
    }
}
