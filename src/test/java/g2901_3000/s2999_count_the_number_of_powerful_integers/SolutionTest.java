package g2901_3000.s2999_count_the_number_of_powerful_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPowerfulInt() {
        assertThat(new Solution().numberOfPowerfulInt(1L, 6000L, 4, "124"), equalTo(5L));
    }

    @Test
    void numberOfPowerfulInt2() {
        assertThat(new Solution().numberOfPowerfulInt(15L, 215L, 5, "10"), equalTo(2L));
    }
}
