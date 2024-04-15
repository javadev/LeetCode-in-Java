package g0901_1000.s0964_least_operators_to_express_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leastOpsExpressTarget() {
        assertThat(new Solution().leastOpsExpressTarget(3, 19), equalTo(5));
    }

    @Test
    void leastOpsExpressTarget2() {
        assertThat(new Solution().leastOpsExpressTarget(5, 501), equalTo(8));
    }

    @Test
    void leastOpsExpressTarget3() {
        assertThat(new Solution().leastOpsExpressTarget(100, 100000000), equalTo(3));
    }
}
