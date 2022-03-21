package g1301_1400.s1359_count_all_valid_pickup_and_delivery_options;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOrders() {
        assertThat(new Solution().countOrders(1), equalTo(1));
    }

    @Test
    void countOrders2() {
        assertThat(new Solution().countOrders(2), equalTo(6));
    }

    @Test
    void countOrders3() {
        assertThat(new Solution().countOrders(3), equalTo(90));
    }
}
