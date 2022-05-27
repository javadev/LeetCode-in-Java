package g2001_2100.s2073_time_needed_to_buy_tickets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void timeRequiredToBuy() {
        assertThat(new Solution().timeRequiredToBuy(new int[] {2, 3, 2}, 2), equalTo(6));
    }

    @Test
    void timeRequiredToBuy2() {
        assertThat(new Solution().timeRequiredToBuy(new int[] {5, 1, 1, 1}, 0), equalTo(8));
    }
}
