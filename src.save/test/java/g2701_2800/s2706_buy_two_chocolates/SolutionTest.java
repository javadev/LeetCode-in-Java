package g2701_2800.s2706_buy_two_chocolates;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buyChoco() {
        assertThat(new Solution().buyChoco(new int[] {1, 2, 2}, 3), equalTo(0));
    }

    @Test
    void buyChoco2() {
        assertThat(new Solution().buyChoco(new int[] {3, 2, 3}, 3), equalTo(3));
    }
}
