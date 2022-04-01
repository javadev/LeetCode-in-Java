package g1301_1400.s1390_four_divisors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumFourDivisors() {
        assertThat(new Solution().sumFourDivisors(new int[] {21, 4, 7}), equalTo(32));
    }

    @Test
    void sumFourDivisors2() {
        assertThat(new Solution().sumFourDivisors(new int[] {21, 21}), equalTo(64));
    }

    @Test
    void sumFourDivisors3() {
        assertThat(new Solution().sumFourDivisors(new int[] {1, 2, 3, 4, 5}), equalTo(0));
    }
}
