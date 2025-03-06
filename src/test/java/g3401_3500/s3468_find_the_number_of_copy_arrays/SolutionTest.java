package g3401_3500.s3468_find_the_number_of_copy_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countArrays() {
        assertThat(
                new Solution()
                        .countArrays(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}}),
                equalTo(2));
    }

    @Test
    void countArrays2() {
        assertThat(
                new Solution()
                        .countArrays(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 10}, {2, 9}, {3, 8}, {4, 7}}),
                equalTo(4));
    }

    @Test
    void countArrays3() {
        assertThat(
                new Solution()
                        .countArrays(
                                new int[] {1, 2, 1, 2},
                                new int[][] {{1, 1}, {2, 3}, {3, 3}, {2, 3}}),
                equalTo(0));
    }
}
