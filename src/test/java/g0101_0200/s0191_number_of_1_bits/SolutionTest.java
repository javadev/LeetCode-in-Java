package g0101_0200.s0191_number_of_1_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hammingWeight() {
        assertThat(new Solution().hammingWeight(0b00000000000000000000000000001011), equalTo(3));
    }

    @Test
    void hammingWeight2() {
        assertThat(new Solution().hammingWeight(0b00000000000000000000000010000000), equalTo(1));
    }
}
