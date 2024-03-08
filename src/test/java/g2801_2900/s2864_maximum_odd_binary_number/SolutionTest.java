package g2801_2900.s2864_maximum_odd_binary_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumOddBinaryNumber() {
        assertThat(new Solution().maximumOddBinaryNumber("010"), equalTo("001"));
    }

    @Test
    void maximumOddBinaryNumber2() {
        assertThat(new Solution().maximumOddBinaryNumber("0101"), equalTo("1001"));
    }
}
