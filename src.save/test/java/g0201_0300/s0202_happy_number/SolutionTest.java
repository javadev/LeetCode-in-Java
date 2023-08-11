package g0201_0300.s0202_happy_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isHappy() {
        assertThat(new Solution().isHappy(19), equalTo(true));
    }

    @Test
    void isHappy2() {
        assertThat(new Solution().isHappy(2), equalTo(false));
    }
}
