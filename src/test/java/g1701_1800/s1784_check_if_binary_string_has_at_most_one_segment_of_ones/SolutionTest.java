package g1701_1800.s1784_check_if_binary_string_has_at_most_one_segment_of_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkOnesSegment() {
        assertThat(new Solution().checkOnesSegment("1001"), equalTo(false));
    }

    @Test
    void checkOnesSegment2() {
        assertThat(new Solution().checkOnesSegment("110"), equalTo(true));
    }
}
