package g1601_1700.s1619_mean_of_array_after_removing_some_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trimMean() {
        assertThat(
                new Solution()
                        .trimMean(
                                new int[] {
                                    1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3
                                }),
                equalTo(2.00));
    }

    @Test
    void trimMean2() {
        assertThat(
                new Solution()
                        .trimMean(
                                new int[] {
                                    6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0
                                }),
                equalTo(4.00));
    }

    @Test
    void trimMean3() {
        assertThat(
                new Solution()
                        .trimMean(
                                new int[] {
                                    6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8,
                                    1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4
                                }),
                equalTo(4.777777777777778));
    }
}
