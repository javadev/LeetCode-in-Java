package g0701_0800.s0762_prime_number_of_set_bits_in_binary_representation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPrimeSetBits() {
        assertThat(new Solution().countPrimeSetBits(6, 10), equalTo(4));
    }

    @Test
    void countPrimeSetBits2() {
        assertThat(new Solution().countPrimeSetBits(10, 15), equalTo(5));
    }
}
