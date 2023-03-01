package g0201_0300.s0278_first_bad_version;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstBadVersion() {
        assertThat(new Solution(4).firstBadVersion(5), equalTo(4));
    }

    @Test
    void firstBadVersion2() {
        assertThat(new Solution(1).firstBadVersion(1), equalTo(1));
    }

    @Test
    void firstBadVersion3() {
        assertThat(new Solution(98).firstBadVersion(99), equalTo(98));
    }

    @Test
    void firstBadVersion4() {
        assertThat(new Solution(32).firstBadVersion(99), equalTo(32));
    }
}
