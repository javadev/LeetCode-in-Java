package g1001_1100.s1012_numbers_with_repeated_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numDupDigitsAtMostN() {
        assertThat(new Solution().numDupDigitsAtMostN(20), equalTo(1));
    }

    @Test
    void numDupDigitsAtMostN2() {
        assertThat(new Solution().numDupDigitsAtMostN(100), equalTo(10));
    }

    @Test
    void numDupDigitsAtMostN3() {
        assertThat(new Solution().numDupDigitsAtMostN(1000), equalTo(262));
    }
}
