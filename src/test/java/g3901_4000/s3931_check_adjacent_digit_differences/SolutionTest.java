package g3901_4000.s3931_check_adjacent_digit_differences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isAdjacentDiffAtMostTwo() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("132"), equalTo(true));
    }

    @Test
    void isAdjacentDiffAtMostTwo2() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("129"), equalTo(false));
    }

    @Test
    void isAdjacentDiffAtMostTwo3() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("00"), equalTo(true));
    }

    @Test
    void isAdjacentDiffAtMostTwo4() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("97531"), equalTo(true));
    }

    @Test
    void isAdjacentDiffAtMostTwo5() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("03"), equalTo(false));
    }

    @Test
    void isAdjacentDiffAtMostTwo6() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("90"), equalTo(false));
    }

    @Test
    void isAdjacentDiffAtMostTwo7() {
        assertThat(new Solution().isAdjacentDiffAtMostTwo("0123456789"), equalTo(true));
    }
}
