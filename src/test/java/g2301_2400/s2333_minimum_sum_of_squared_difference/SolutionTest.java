package g2301_2400.s2333_minimum_sum_of_squared_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSumSquareDiff() {
        assertThat(
                new Solution()
                        .minSumSquareDiff(new int[] {1, 2, 3, 4}, new int[] {2, 10, 20, 19}, 0, 0),
                equalTo(579L));
    }

    @Test
    void minSumSquareDiff2() {
        assertThat(
                new Solution()
                        .minSumSquareDiff(new int[] {1, 4, 10, 12}, new int[] {5, 8, 6, 9}, 1, 1),
                equalTo(43L));
    }

    @Test
    void minSumSquareDiff3() {
        assertThat(
                new Solution()
                        .minSumSquareDiff(
                                new int[] {7, 11, 4, 19, 11, 5, 6, 1, 8},
                                new int[] {4, 7, 6, 16, 12, 9, 10, 2, 10},
                                3,
                                6),
                equalTo(27L));
    }
}
