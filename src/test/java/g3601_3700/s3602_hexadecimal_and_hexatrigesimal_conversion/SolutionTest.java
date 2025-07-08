package g3601_3700.s3602_hexadecimal_and_hexatrigesimal_conversion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void concatHex36() {
        assertThat(new Solution().concatHex36(13), equalTo("A91P1"));
    }

    @Test
    void concatHex362() {
        assertThat(new Solution().concatHex36(36), equalTo("5101000"));
    }
}
