package g2101_2200.s2191_sort_the_jumbled_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortJumbled() {
        assertThat(
                new Solution()
                        .sortJumbled(
                                new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[] {991, 338, 38}),
                equalTo(new int[] {338, 38, 991}));
    }

    @Test
    void sortJumbled2() {
        assertThat(
                new Solution()
                        .sortJumbled(
                                new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                                new int[] {789, 456, 123}),
                equalTo(new int[] {123, 456, 789}));
    }
}
