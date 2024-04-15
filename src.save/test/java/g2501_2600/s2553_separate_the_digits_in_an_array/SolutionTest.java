package g2501_2600.s2553_separate_the_digits_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void separateDigits() {
        assertThat(
                new Solution().separateDigits(new int[] {13, 25, 83, 77}),
                equalTo(new int[] {1, 3, 2, 5, 8, 3, 7, 7}));
    }

    @Test
    void separateDigits2() {
        assertThat(
                new Solution().separateDigits(new int[] {7, 1, 3, 9}),
                equalTo(new int[] {7, 1, 3, 9}));
    }
}
