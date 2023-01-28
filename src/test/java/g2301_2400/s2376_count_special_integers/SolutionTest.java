package g2301_2400.s2376_count_special_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSpecialNumbers() {
        assertThat(new Solution().countSpecialNumbers(20), equalTo(19));
    }

    @Test
    void countSpecialNumbers2() {
        assertThat(new Solution().countSpecialNumbers(5), equalTo(5));
    }

    @Test
    void countSpecialNumbers3() {
        assertThat(new Solution().countSpecialNumbers(135), equalTo(110));
    }
}
