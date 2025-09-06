package g3601_3700.s3663_find_the_least_frequent_digit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLeastFrequentDigit() {
        assertThat(new Solution().getLeastFrequentDigit(1553322), equalTo(1));
    }

    @Test
    void getLeastFrequentDigit2() {
        assertThat(new Solution().getLeastFrequentDigit(723344511), equalTo(2));
    }
}
