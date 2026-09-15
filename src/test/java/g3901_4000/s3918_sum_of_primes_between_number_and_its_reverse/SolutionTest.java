package g3901_4000.s3918_sum_of_primes_between_number_and_its_reverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfPrimesInRange() {
        assertThat(new Solution().sumOfPrimesInRange(13), equalTo(132));
    }

    @Test
    void sumOfPrimesInRange2() {
        assertThat(new Solution().sumOfPrimesInRange(10), equalTo(17));
    }

    @Test
    void sumOfPrimesInRange3() {
        assertThat(new Solution().sumOfPrimesInRange(8), equalTo(0));
    }
}
