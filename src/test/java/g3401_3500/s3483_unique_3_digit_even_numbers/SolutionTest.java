package g3401_3500.s3483_unique_3_digit_even_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalNumbers() {
        assertThat(new Solution().totalNumbers(new int[] {1, 2, 3, 4}), equalTo(12));
    }

    @Test
    void totalNumbers2() {
        assertThat(new Solution().totalNumbers(new int[] {0, 2, 2}), equalTo(2));
    }

    @Test
    void totalNumbers3() {
        assertThat(new Solution().totalNumbers(new int[] {6, 6, 6}), equalTo(1));
    }

    @Test
    void totalNumbers4() {
        assertThat(new Solution().totalNumbers(new int[] {1, 3, 5}), equalTo(0));
    }
}
