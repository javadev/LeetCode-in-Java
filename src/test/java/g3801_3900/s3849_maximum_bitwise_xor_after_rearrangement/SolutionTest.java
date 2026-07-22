package g3801_3900.s3849_maximum_bitwise_xor_after_rearrangement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumXor() {
        assertThat(new Solution().maximumXor("101", "011"), equalTo("110"));
    }

    @Test
    void maximumXor2() {
        assertThat(new Solution().maximumXor("0110", "1110"), equalTo("1101"));
    }

    @Test
    void maximumXor3() {
        assertThat(new Solution().maximumXor("0101", "1001"), equalTo("1111"));
    }
}
