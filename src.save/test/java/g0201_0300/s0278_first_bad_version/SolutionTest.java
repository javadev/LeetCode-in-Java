package g0201_0300.s0278_first_bad_version;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstBadVersion() {
        assertThat(new Solution().firstBadVersion(5), equalTo(4));
    }

    @Test
    void firstBadVersion2() {
        assertThat(new Solution().firstBadVersion(1), equalTo(1));
    }
}
