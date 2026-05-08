package g3701_3800.s3770_largest_prime_from_consecutive_prime_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPrime() {
        assertThat(new Solution().largestPrime(100), equalTo(41));
    }

    @Test
    void largestPrime2() {
        assertThat(new Solution().largestPrime(2), equalTo(2));
    }

    @Test
    void largestPrime3() {
        assertThat(new Solution().largestPrime(1), equalTo(0));
    }
}
