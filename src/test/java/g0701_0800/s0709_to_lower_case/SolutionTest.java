package g0701_0800.s0709_to_lower_case;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void toLowerCase() {
        assertThat(new Solution().toLowerCase("Hello"), equalTo("hello"));
    }

    @Test
    void toLowerCase2() {
        assertThat(new Solution().toLowerCase("Here"), equalTo("here"));
    }

    @Test
    void toLowerCase3() {
        assertThat(new Solution().toLowerCase("LOVELY"), equalTo("lovely"));
    }
}
