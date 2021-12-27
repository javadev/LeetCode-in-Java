package g0401_0500.s0423_reconstruct_original_digits_from_english;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void originalDigits() {
        assertThat(new Solution().originalDigits("owoztneoer"), equalTo("012"));
    }

    @Test
    void originalDigits2() {
        assertThat(new Solution().originalDigits("fviefuro"), equalTo("45"));
    }
}
