package g3501_3600.s3519_count_numbers_with_non_decreasing_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNumbers() {
        assertThat(new Solution().countNumbers("23", "28", 8), equalTo(3));
    }

    @Test
    void countNumbers2() {
        assertThat(new Solution().countNumbers("2", "7", 2), equalTo(2));
    }
}
