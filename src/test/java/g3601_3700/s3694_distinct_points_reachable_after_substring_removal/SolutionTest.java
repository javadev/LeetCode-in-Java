package g3601_3700.s3694_distinct_points_reachable_after_substring_removal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctPoints() {
        assertThat(new Solution().distinctPoints("LUL", 1), equalTo(2));
    }

    @Test
    void distinctPoints2() {
        assertThat(new Solution().distinctPoints("UDLR", 4), equalTo(1));
    }

    @Test
    void distinctPoints3() {
        assertThat(new Solution().distinctPoints("UU", 1), equalTo(1));
    }
}
