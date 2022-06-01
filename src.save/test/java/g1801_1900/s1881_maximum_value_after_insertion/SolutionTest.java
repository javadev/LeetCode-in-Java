package g1801_1900.s1881_maximum_value_after_insertion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(new Solution().maxValue("99", 9), equalTo("999"));
    }

    @Test
    void maxValue2() {
        assertThat(new Solution().maxValue("-13", 2), equalTo("-123"));
    }
}
