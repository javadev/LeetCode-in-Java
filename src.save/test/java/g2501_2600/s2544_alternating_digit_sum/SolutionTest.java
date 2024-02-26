package g2501_2600.s2544_alternating_digit_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alternateDigitSum() {
        assertThat(new Solution().alternateDigitSum(521), equalTo(4));
    }

    @Test
    void alternateDigitSum2() {
        assertThat(new Solution().alternateDigitSum(111), equalTo(1));
    }

    @Test
    void alternateDigitSum3() {
        assertThat(new Solution().alternateDigitSum(886996), equalTo(0));
    }
}
