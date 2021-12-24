package g0401_0500.s0458_poor_pigs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void poorPigs() {
        assertThat(new Solution().poorPigs(1000,15,60), equalTo(5));
    }

    @Test
    void poorPigs2() {
        assertThat(new Solution().poorPigs(4,15,15), equalTo(2));
    }

    @Test
    void poorPigs3() {
        assertThat(new Solution().poorPigs(4,15,30), equalTo(2));
    }
}
