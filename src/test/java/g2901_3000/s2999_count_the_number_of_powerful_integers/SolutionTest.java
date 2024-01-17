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

    @Test
    void numberOfPowerfulInt3() {
        assertThat(new Solution().numberOfPowerfulInt(1L, 2000L, 8, "1"), equalTo(162L));
    }

    @Test
    void numberOfPowerfulInt4() {
        assertThat(new Solution().numberOfPowerfulInt(1L, 1L, 8, "2"), equalTo(0L));
    }
}
