package g0301_0400.s0400_nth_digit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNthDigit() {
        assertThat(new Solution().findNthDigit(3), equalTo(3));
    }

    @Test
    void findNthDigit2() {
        assertThat(new Solution().findNthDigit(11), equalTo(0));
    }
}
