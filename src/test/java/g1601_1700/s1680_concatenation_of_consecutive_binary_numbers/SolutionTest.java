package g1601_1700.s1680_concatenation_of_consecutive_binary_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void concatenatedBinary() {
        assertThat(new Solution().concatenatedBinary(1), equalTo(1));
    }

    @Test
    void concatenatedBinary2() {
        assertThat(new Solution().concatenatedBinary(3), equalTo(27));
    }

    @Test
    void concatenatedBinary3() {
        assertThat(new Solution().concatenatedBinary(12), equalTo(505379714));
    }
}
