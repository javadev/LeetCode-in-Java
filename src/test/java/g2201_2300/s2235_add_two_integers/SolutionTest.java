package g2201_2300.s2235_add_two_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sum() {
        assertThat(new Solution().sum(12, 5), equalTo(17));
    }

    @Test
    void sum2() {
        assertThat(new Solution().sum(-10, 4), equalTo(-6));
    }
}
