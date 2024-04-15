package g0501_0600.s0526_beautiful_arrangement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countArrangement() {
        assertThat(new Solution().countArrangement(2), equalTo(2));
    }

    @Test
    void countArrangement2() {
        assertThat(new Solution().countArrangement(1), equalTo(1));
    }
}
