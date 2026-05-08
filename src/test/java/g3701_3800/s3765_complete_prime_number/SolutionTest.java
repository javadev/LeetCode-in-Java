package g3701_3800.s3765_complete_prime_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void completePrime() {
        assertThat(new Solution().completePrime(239), equalTo(false));
    }

    @Test
    void completePrime2() {
        assertThat(new Solution().completePrime(21), equalTo(false));
    }

    @Test
    void completePrime3() {
        assertThat(new Solution().completePrime(2), equalTo(true));
    }
}
