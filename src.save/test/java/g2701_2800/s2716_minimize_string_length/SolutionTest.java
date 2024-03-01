package g2701_2800.s2716_minimize_string_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizedStringLength() {
        assertThat(new Solution().minimizedStringLength("aaabc"), equalTo(3));
    }

    @Test
    void minimizedStringLength2() {
        assertThat(new Solution().minimizedStringLength("cbbd"), equalTo(3));
    }

    @Test
    void minimizedStringLength3() {
        assertThat(new Solution().minimizedStringLength("dddaaa"), equalTo(2));
    }
}
