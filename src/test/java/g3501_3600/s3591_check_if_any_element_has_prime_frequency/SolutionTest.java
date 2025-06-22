package g3501_3600.s3591_check_if_any_element_has_prime_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkPrimeFrequency() {
        assertThat(new Solution().checkPrimeFrequency(new int[] {1, 2, 3, 4, 5, 4}), equalTo(true));
    }

    @Test
    void checkPrimeFrequency2() {
        assertThat(new Solution().checkPrimeFrequency(new int[] {1, 2, 3, 4, 5}), equalTo(false));
    }

    @Test
    void checkPrimeFrequency3() {
        assertThat(new Solution().checkPrimeFrequency(new int[] {2, 2, 2, 4, 4}), equalTo(true));
    }
}
