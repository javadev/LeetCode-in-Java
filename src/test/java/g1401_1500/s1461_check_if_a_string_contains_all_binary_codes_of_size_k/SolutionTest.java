package g1401_1500.s1461_check_if_a_string_contains_all_binary_codes_of_size_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasAllCodes() {
        assertThat(new Solution().hasAllCodes("00110110", 2), equalTo(true));
    }

    @Test
    void hasAllCodes2() {
        assertThat(new Solution().hasAllCodes("0110", 1), equalTo(true));
    }

    @Test
    void hasAllCodes3() {
        assertThat(new Solution().hasAllCodes("0110", 2), equalTo(false));
    }
}
