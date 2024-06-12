package g3101_3200.s3174_clear_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void clearDigits() {
        assertThat(new Solution().clearDigits("abc"), equalTo("abc"));
    }

    @Test
    void clearDigits2() {
        assertThat(new Solution().clearDigits("cb34"), equalTo(""));
    }
}
