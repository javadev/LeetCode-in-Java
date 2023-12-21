package g2301_2400.s2306_naming_a_company;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctNames() {
        assertThat(
                new Solution().distinctNames(new String[] {"coffee", "donuts", "time", "toffee"}),
                equalTo(6L));
    }

    @Test
    void distinctNames2() {
        assertThat(new Solution().distinctNames(new String[] {"lack", "back"}), equalTo(0L));
    }
}
