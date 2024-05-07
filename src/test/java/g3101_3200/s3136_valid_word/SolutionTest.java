package g3101_3200.s3136_valid_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValid() {
        assertThat(new Solution().isValid("234Adas"), equalTo(true));
    }

    @Test
    void isValid2() {
        assertThat(new Solution().isValid("b3"), equalTo(false));
    }

    @Test
    void isValid3() {
        assertThat(new Solution().isValid("a3$e"), equalTo(false));
    }
}
