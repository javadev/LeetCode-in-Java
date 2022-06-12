package g2201_2300.s2220_minimum_bit_flips_to_convert_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minBitFlips() {
        assertThat(new Solution().minBitFlips(10, 7), equalTo(3));
    }

    @Test
    void minBitFlips2() {
        assertThat(new Solution().minBitFlips(3, 4), equalTo(3));
    }
}
