package g1801_1900.s1896_minimum_cost_to_change_the_final_value_of_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperationsToFlip() {
        assertThat(new Solution().minOperationsToFlip("1&(0|1)"), equalTo(1));
    }

    @Test
    void minOperationsToFlip2() {
        assertThat(new Solution().minOperationsToFlip("(0&0)&(0&0&0)"), equalTo(3));
    }

    @Test
    void minOperationsToFlip3() {
        assertThat(new Solution().minOperationsToFlip("(0|(1|0&1))"), equalTo(1));
    }
}
