package g1101_1200.s1175_prime_arrangements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numPrimeArrangements() {
        assertThat(new Solution().numPrimeArrangements(5), equalTo(12));
    }

    @Test
    void numPrimeArrangements2() {
        assertThat(new Solution().numPrimeArrangements(100), equalTo(682289015));
    }
}
