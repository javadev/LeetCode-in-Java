package g1701_1800.s1702_maximum_binary_string_after_change;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBinaryString() {
        assertThat(new Solution().maximumBinaryString("000110"), equalTo("111011"));
    }

    @Test
    void maximumBinaryString2() {
        assertThat(new Solution().maximumBinaryString("01"), equalTo("01"));
    }
}
