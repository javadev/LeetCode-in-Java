package g1901_2000.s1952_three_divisors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isThree() {
        assertThat(new Solution().isThree(2), equalTo(false));
    }

    @Test
    void isThree2() {
        assertThat(new Solution().isThree(4), equalTo(true));
    }
}
