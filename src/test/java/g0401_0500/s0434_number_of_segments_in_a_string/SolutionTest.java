package g0401_0500.s0434_number_of_segments_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSegments() {
        assertThat(new Solution().countSegments("Hello, my name is John"), equalTo(5));
    }

    @Test
    void countSegments2() {
        assertThat(new Solution().countSegments("Hello"), equalTo(1));
    }
}
