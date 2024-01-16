package g0401_0500.s0470_implement_rand10_using_rand7;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rand10() {
        for (int i = 0; i < 1; i++) {
            int result = new Solution().rand10();
            assertThat(result >= 1 && result <= 10, equalTo(true));
        }
    }

    @Test
    void rand102() {
        for (int i = 0; i < 2; i++) {
            int result = new Solution().rand10();
            assertThat(result >= 1 && result <= 10, equalTo(true));
        }
    }

    @Test
    void rand103() {
        for (int i = 0; i < 3; i++) {
            int result = new Solution().rand10();
            assertThat(result >= 1 && result <= 10, equalTo(true));
        }
    }
}
