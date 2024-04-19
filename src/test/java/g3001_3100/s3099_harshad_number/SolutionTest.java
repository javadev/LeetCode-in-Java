package g3001_3100.s3099_harshad_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfTheDigitsOfHarshadNumber() {
        assertThat(new Solution().sumOfTheDigitsOfHarshadNumber(18), equalTo(9));
    }

    @Test
    void sumOfTheDigitsOfHarshadNumber2() {
        assertThat(new Solution().sumOfTheDigitsOfHarshadNumber(23), equalTo(-1));
    }
}
