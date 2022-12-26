package g0901_1000.s0983_minimum_cost_for_tickets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mincostTickets() {
        assertThat(
                new Solution().mincostTickets(new int[] {1, 4, 6, 7, 8, 20}, new int[] {2, 7, 15}),
                equalTo(11));
    }

    @Test
    void mincostTickets2() {
        assertThat(
                new Solution()
                        .mincostTickets(
                                new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31},
                                new int[] {2, 7, 15}),
                equalTo(17));
    }
}
