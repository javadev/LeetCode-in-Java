package g3701_3800.s3726_remove_zeros_in_decimal_representation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeZeros() {
        assertThat(new Solution().removeZeros(1020030L), equalTo(123L));
    }

    @Test
    void removeZeros2() {
        assertThat(new Solution().removeZeros(1L), equalTo(1L));
    }
}
