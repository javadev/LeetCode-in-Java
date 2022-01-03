package g0501_0600.s0553_optimal_division;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void optimalDivision() {
        assertThat(
                new Solution().optimalDivision(new int[] {1000, 100, 10, 2}),
                equalTo("1000/(100/10/2)"));
    }

    @Test
    void optimalDivision2() {
        assertThat(new Solution().optimalDivision(new int[] {2, 3, 4}), equalTo("2/(3/4)"));
    }

    @Test
    void optimalDivision3() {
        assertThat(new Solution().optimalDivision(new int[] {2}), equalTo("2"));
    }
}
