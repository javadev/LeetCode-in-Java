package g2601_2700.s2645_minimum_additions_to_make_valid_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addMinimum() {
        assertThat(new Solution().addMinimum("b"), equalTo(2));
    }

    @Test
    void addMinimum2() {
        assertThat(new Solution().addMinimum("aaa"), equalTo(6));
    }

    @Test
    void addMinimum3() {
        assertThat(new Solution().addMinimum("abc"), equalTo(0));
    }
}
