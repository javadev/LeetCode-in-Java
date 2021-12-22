package g0301_0400.s0396_rotate_function;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void maxRotateFunction() {
        assertThat(new Solution().maxRotateFunction(new int[]{4,3,2,6}), equalTo(26));
    }

    @Test
    void maxRotateFunction2() {
        assertThat(new Solution().maxRotateFunction(new int[]{100}), equalTo(0));
    }
}
