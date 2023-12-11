package g2501_2600.s2582_pass_the_pillow;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void passThePillow() {
        assertThat(new Solution().passThePillow(4, 5), equalTo(2));
    }

    @Test
    void passThePillow2() {
        assertThat(new Solution().passThePillow(3, 2), equalTo(3));
    }
}
