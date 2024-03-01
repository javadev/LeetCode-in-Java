package g0001_0100.s0038_count_and_say;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countAndSay() {
        assertThat(new Solution().countAndSay(1), equalTo("1"));
    }

    @Test
    void countAndSay2() {
        assertThat(new Solution().countAndSay(2), equalTo("11"));
    }

    @Test
    void countAndSay3() {
        assertThat(new Solution().countAndSay(3), equalTo("21"));
    }

    @Test
    void countAndSay4() {
        assertThat(new Solution().countAndSay(4), equalTo("1211"));
    }
}
