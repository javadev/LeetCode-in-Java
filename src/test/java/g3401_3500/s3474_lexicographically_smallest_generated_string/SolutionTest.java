package g3401_3500.s3474_lexicographically_smallest_generated_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateString() {
        assertThat(new Solution().generateString("TFTF", "ab"), equalTo("ababa"));
    }

    @Test
    void generateString2() {
        assertThat(new Solution().generateString("TFTF", "abc"), equalTo(""));
    }

    @Test
    void generateString3() {
        assertThat(new Solution().generateString("F", "d"), equalTo("a"));
    }

    @Test
    void generateString4() {
        assertThat(new Solution().generateString("TTFFT", "fff"), equalTo(""));
    }
}
