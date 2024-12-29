package g3301_3400.s3393_count_paths_with_the_given_xor_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPathsWithXorValue() {
        assertThat(
                new Solution()
                        .countPathsWithXorValue(
                                new int[][] {{2, 1, 5}, {7, 10, 0}, {12, 6, 4}}, 11),
                equalTo(3));
    }

    @Test
    void countPathsWithXorValue2() {
        assertThat(
                new Solution()
                        .countPathsWithXorValue(
                                new int[][] {{1, 3, 3, 3}, {0, 3, 3, 2}, {3, 0, 1, 1}}, 2),
                equalTo(5));
    }

    @Test
    void countPathsWithXorValue3() {
        assertThat(
                new Solution()
                        .countPathsWithXorValue(
                                new int[][] {{1, 1, 1, 2}, {3, 0, 3, 2}, {3, 0, 2, 2}}, 10),
                equalTo(0));
    }
}
