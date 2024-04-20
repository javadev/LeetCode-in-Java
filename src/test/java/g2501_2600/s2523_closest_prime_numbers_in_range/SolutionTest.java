package g2501_2600.s2523_closest_prime_numbers_in_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestPrimes() {
        assertThat(new Solution().closestPrimes(10, 19), equalTo(new int[] {11, 13}));
    }

    @Test
    void closestPrimes2() {
        assertThat(new Solution().closestPrimes(4, 6), equalTo(new int[] {-1, -1}));
    }
}
