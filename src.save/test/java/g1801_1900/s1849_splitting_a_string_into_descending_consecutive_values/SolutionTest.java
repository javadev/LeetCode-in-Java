package g1801_1900.s1849_splitting_a_string_into_descending_consecutive_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitString() {
        assertThat(new Solution().splitString("1234"), equalTo(false));
    }

    @Test
    void splitString2() {
        assertThat(new Solution().splitString("050043"), equalTo(true));
    }

    @Test
    void splitString3() {
        assertThat(new Solution().splitString("9080701"), equalTo(false));
    }
}
