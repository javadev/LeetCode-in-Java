package g1601_1700.s1646_get_maximum_in_generated_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaximumGenerated() {
        assertThat(new Solution().getMaximumGenerated(7), equalTo(3));
    }

    @Test
    void getMaximumGenerated2() {
        assertThat(new Solution().getMaximumGenerated(2), equalTo(1));
    }

    @Test
    void getMaximumGenerated3() {
        assertThat(new Solution().getMaximumGenerated(3), equalTo(2));
    }
}
