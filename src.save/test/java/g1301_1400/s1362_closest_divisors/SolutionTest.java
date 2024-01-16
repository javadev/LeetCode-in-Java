package g1301_1400.s1362_closest_divisors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestDivisors() {
        assertThat(new Solution().closestDivisors(8), equalTo(new int[] {3, 3}));
    }

    @Test
    void closestDivisors2() {
        assertThat(new Solution().closestDivisors(123), equalTo(new int[] {5, 25}));
    }

    @Test
    void closestDivisors3() {
        assertThat(new Solution().closestDivisors(999), equalTo(new int[] {25, 40}));
    }
}
