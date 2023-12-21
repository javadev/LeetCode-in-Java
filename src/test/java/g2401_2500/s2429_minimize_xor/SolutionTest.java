package g2401_2500.s2429_minimize_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeXor() {
        assertThat(new Solution().minimizeXor(3, 5), equalTo(3));
    }

    @Test
    void minimizeXor2() {
        assertThat(new Solution().minimizeXor(1, 12), equalTo(3));
    }
}
