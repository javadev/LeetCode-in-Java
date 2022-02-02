package g0801_0900.s0899_orderly_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void orderlyQueue() {
        assertThat(new Solution().orderlyQueue("cba", 1), equalTo("acb"));
    }

    @Test
    void orderlyQueue2() {
        assertThat(new Solution().orderlyQueue("baaca", 3), equalTo("aaabc"));
    }
}
