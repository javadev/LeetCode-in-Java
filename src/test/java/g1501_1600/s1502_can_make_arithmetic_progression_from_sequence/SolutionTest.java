package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakeArithmeticProgression() {
        assertThat(new Solution().canMakeArithmeticProgression(new int[] {3, 5, 1}), equalTo(true));
    }

    @Test
    void canMakeArithmeticProgression2() {
        assertThat(
                new Solution().canMakeArithmeticProgression(new int[] {1, 2, 4}), equalTo(false));
    }
}
