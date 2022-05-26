package g0201_0300.s0204_count_primes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPrimes() {
        assertThat(new Solution().countPrimes(10), equalTo(4));
    }

    @Test
    void countPrimes2() {
        assertThat(new Solution().countPrimes(0), equalTo(0));
    }

    @Test
    void countPrimes3() {
        assertThat(new Solution().countPrimes(1), equalTo(0));
    }
}
