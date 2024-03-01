package g1601_1700.s1694_reformat_phone_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reformatNumber() {
        assertThat(new Solution().reformatNumber("1-23-45 6"), equalTo("123-456"));
    }

    @Test
    void reformatNumber2() {
        assertThat(new Solution().reformatNumber("123 4-567"), equalTo("123-45-67"));
    }

    @Test
    void reformatNumber3() {
        assertThat(new Solution().reformatNumber("123 4-5678"), equalTo("123-456-78"));
    }
}
