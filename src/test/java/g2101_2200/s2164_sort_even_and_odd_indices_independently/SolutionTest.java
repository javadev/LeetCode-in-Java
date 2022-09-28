package g2101_2200.s2164_sort_even_and_odd_indices_independently;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortEvenOdd() {
        assertThat(
                new Solution().sortEvenOdd(new int[] {4, 1, 2, 3}),
                equalTo(new int[] {2, 3, 4, 1}));
    }

    @Test
    void sortEvenOdd2() {
        assertThat(new Solution().sortEvenOdd(new int[] {2, 1}), equalTo(new int[] {2, 1}));
    }
}
