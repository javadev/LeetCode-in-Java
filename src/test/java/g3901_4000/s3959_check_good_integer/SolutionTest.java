package g3901_4000.s3959_check_good_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkGoodInteger() {
        assertThat(new Solution().checkGoodInteger(1000), equalTo(false));
    }

    @Test
    void checkGoodInteger2() {
        assertThat(new Solution().checkGoodInteger(19), equalTo(true));
    }

    @Test
    void checkGoodInteger3() {
        assertThat(new Solution().checkGoodInteger(99), equalTo(true));
    }
}
