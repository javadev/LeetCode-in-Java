package g3501_3600.s3556_sum_of_largest_prime_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfLargestPrimes() {
        assertThat(new Solution().sumOfLargestPrimes("12234"), equalTo(1469L));
    }

    @Test
    void sumOfLargestPrimes2() {
        assertThat(new Solution().sumOfLargestPrimes("111"), equalTo(11L));
    }
}
