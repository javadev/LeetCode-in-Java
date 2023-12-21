package g0701_0800.s0728_self_dividing_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void selfDividingNumbers() {
        assertThat(
                new Solution().selfDividingNumbers(1, 22),
                equalTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)));
    }

    @Test
    void selfDividingNumbers2() {
        assertThat(
                new Solution().selfDividingNumbers(47, 85), equalTo(Arrays.asList(48, 55, 66, 77)));
    }
}
