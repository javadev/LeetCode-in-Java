package g2701_2800.s2729_check_if_the_number_is_fascinating;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isFascinating() {
        assertThat(new Solution().isFascinating(192), equalTo(true));
    }

    @Test
    void isFascinating2() {
        assertThat(new Solution().isFascinating(100), equalTo(false));
    }
}
