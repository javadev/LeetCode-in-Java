package g0201_0300.s0204_count_primes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void countPrimes() {
        assertThat(new Solution().countPrimes(10), equalTo(4));
    }
}
