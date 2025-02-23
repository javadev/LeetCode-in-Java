package g3401_3500.s3463_check_if_digits_are_equal_in_string_after_operations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasSameDigits() {
        assertThat(new Solution().hasSameDigits("3902"), equalTo(true));
    }

    @Test
    void hasSameDigits2() {
        assertThat(new Solution().hasSameDigits("34789"), equalTo(false));
    }
}
