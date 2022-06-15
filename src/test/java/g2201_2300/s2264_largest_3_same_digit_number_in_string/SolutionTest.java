package g2201_2300.s2264_largest_3_same_digit_number_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestGoodInteger() {
        assertThat(new Solution().largestGoodInteger("6777133339"), equalTo("777"));
    }

    @Test
    void largestGoodInteger2() {
        assertThat(new Solution().largestGoodInteger("2300019"), equalTo("000"));
    }

    @Test
    void largestGoodInteger3() {
        assertThat(new Solution().largestGoodInteger("42352338"), equalTo(""));
    }
}
