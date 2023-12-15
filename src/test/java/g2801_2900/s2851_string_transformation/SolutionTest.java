package g2801_2900.s2851_string_transformation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays("abcd", "cdab", 2), equalTo(2));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays("ababab", "ababab", 1), equalTo(2));
    }
}
