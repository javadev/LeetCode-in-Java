package g0401_0500.s0415_add_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addStrings() {
        assertThat(new Solution().addStrings("11", "123"), equalTo("134"));
    }

    @Test
    void addStrings2() {
        assertThat(new Solution().addStrings("456", "77"), equalTo("533"));
    }
}
