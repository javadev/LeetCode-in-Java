package g1801_1900.s1801_number_of_orders_in_the_backlog;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getNumberOfBacklogOrders() {
        assertThat(
                new Solution()
                        .getNumberOfBacklogOrders(
                                new int[][] {{10, 5, 0}, {15, 2, 1}, {25, 1, 1}, {30, 4, 0}}),
                equalTo(6));
    }

    @Test
    void getNumberOfBacklogOrders2() {
        assertThat(
                new Solution()
                        .getNumberOfBacklogOrders(
                                new int[][] {
                                    {7, 1000000000, 1}, {15, 3, 0}, {5, 999999995, 0}, {5, 1, 1}
                                }),
                equalTo(999999984));
    }
}
